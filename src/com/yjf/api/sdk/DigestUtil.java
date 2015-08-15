package com.yjf.api.sdk;

import java.security.MessageDigest;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Hex;

/**
 * 签名帮助类
 */
public final class DigestUtil {

	/**
	 * 对 dataMap 的内容进行签名，并将签名结果放入 dataMap 中
	 *
	 * @param dataMap          待签名kv
	 * @param securityCheckKey 安全密钥
	 */
	public static void digest(Map<String, String> dataMap, String securityCheckKey) {
		digest(dataMap, securityCheckKey, DigestALGEnum.MD5, "UTF-8");
	}

	/**
	 * 对 dataMap 的内容进行签名，并将签名结果放入 dataMap 中
	 *
	 * @param dataMap          待签名kv
	 * @param securityCheckKey 安全密钥
	 * @param encoding         字符编码
	 */
	public static void digest(Map<String, String> dataMap, String securityCheckKey, String encoding) {
		digest(dataMap, securityCheckKey, DigestALGEnum.MD5, encoding);
	}

	/**
	 * 对 dataMap 的内容进行签名，并将签名结果放入 dataMap 中
	 *
	 * @param dataMap          	待签名kv
	 * @param securityCheckKey  安全密钥
	 * @param de         		签名算法
	 */
	public static void digest(Map<String, String> dataMap, String securityCheckKey, DigestALGEnum de) {
		digest(dataMap, securityCheckKey, de, "UTF-8");
	}

	/**
	 * 校验签名、如果校验失败throws Exception
	 * 
	 * @param dataMap         	待签名kv
	 * @param securityCheckKey	安全密钥
	 * @param de
	 * @param encoding
	 * @return
	 */
	public static void digest(Map<String, String> dataMap, String securityCheckKey, DigestALGEnum de, String encoding) {
		String sign = execute(dataMap, securityCheckKey, de, encoding);
		dataMap.put("sign", sign);
	}
	
	/**
	 *  校验签名、如果校验失败throws Exception
	 * 
	 * @param dataMap         	待签名kv
	 * @param securityCheckKey	安全密钥
	 * @param de
	 * @param encoding
	 * @return
	 */
	public static void check(Map<String, String> dataMap, String securityCheckKey, DigestALGEnum de, String encoding) {
		if (de == null) {
			de = DigestALGEnum.MD5;
		} else if (encoding == null || "".equals(encoding)) {
			encoding = "UTF-8";
		}
		
		String sign = execute(dataMap, securityCheckKey, de, encoding);
		String returnSign = dataMap.get("sign");
		if (! sign.equals(returnSign)) {
			throw new RuntimeException("校验签名失败");
		}
	}
	
	/**
	 * 对 dataMap 的内容进行签名，并将签名结果放入 dataMap 中
	 * 
	 * @param dataMap         	待签名kv
	 * @param securityCheckKey	安全密钥
	 * @param de
	 * @param encoding
	 * @return
	 */
	public static void check(HttpServletRequest request, String securityCheckKey, DigestALGEnum de, String encoding) {
		Map<String, String[]> paramMap = request.getParameterMap(); 
		check(ConvertUtil.toMap(paramMap), securityCheckKey, de, encoding);
	}
	
	
	/**
	 * 对 dataMap 的内容进行签名，并返回签名值
	 *
	 * @param dataMap          待签名kv
	 * @param securityCheckKey 安全密钥
	 * @param de               签名算法
	 * @param encoding         签名编码名称
	 */
	public static String execute(Map<String, String> dataMap, String securityCheckKey, DigestALGEnum de, String encoding) {
		if (dataMap == null) {
			throw new IllegalArgumentException("数据不能为空");
		}
		if (securityCheckKey == null || "".equals(securityCheckKey)) {
			throw new IllegalArgumentException("安全校验码数据不能为空");
		}
		if (de == null) {
			throw new IllegalArgumentException("摘要算法不能为空");
		}
		if (encoding == null || "".equals(encoding)) {
			throw new IllegalArgumentException("字符集不能为空");
		}
		
		/**按a~z、A~Z排序**/
		TreeMap<String, String> treeMap = new TreeMap<String, String>(dataMap);
		
		/**拼接签名字符串**/
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			if ("sign".equals(entry.getKey())) {
				continue;
			}
			sb.append(entry.getKey()).append("=").append(defaultIfBlank(entry.getValue(), "")).append("&");
		}
		
		/**整理字符串**/
		sb.deleteCharAt(sb.length() - 1);
		sb.append(securityCheckKey);
		
		/**执行签名**/
		byte[] toDigest;
		try {
			System.out.println("待签名串：" + sb);
			String str = sb.toString();
			toDigest = str.getBytes(encoding);
			MessageDigest md = MessageDigest.getInstance(de.getName());
			md.update(toDigest);
			return new String (Hex.encodeHex(md.digest()));
		} catch (Exception e) {
			throw new RuntimeException("签名失败", e);
		}
	}
	
	/**
	 * 为空默认
	 * @param value
	 * @param defaultValue
	 * @return
	 */
	private static String defaultIfBlank(String value, String defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		} else {
			return value;
		}
	}
}

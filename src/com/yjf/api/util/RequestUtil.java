package com.yjf.api.util;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.yjf.api.sdk.DigestALGEnum;
import com.yjf.api.sdk.DigestUtil;
import com.yjf.api.sdk.SenderHttpRequest;

/**
 * 请求帮助类
 */
@SuppressWarnings("unused")
public class RequestUtil {

	//环境切换参数
	static MerchantInfo info =  Container.getInfo(1);
	static String c_url = Container.getRequestUrl("sdev");

	
	
	
	public static Logger log = Logger.getLogger(RequestUtil.class);

	public final static String SERVICENAME = "service";
	public final static String NOTIFYNAME = "notifyUrl";
	public final static String RETURNNAME = "returnUrl";

	/**通用异步通知的地址**/
	public final static String NOTIFYURL = "http://bornfinance.yijifu.net/returnPage/notifyResult.html";

	/**通用同步通知的地址**/
	public final static String RETURNURL = "http://bornfinance.yijifu.net/returnPage/successOrFail.html";

	/**请求地址**/
	public final static String requestUrl = c_url;

	/**合作商ID**/
	public final static String partnerId = info.getMerchantId();

	/***私钥**/
	public final static String key = info.getMerchantKey();

	/**
	 * 获取签名值
	 * @param dataMap
	 * @return
	 */
	public String getSign(Map<String, String> dataMap){
		return DigestUtil.execute(dataMap, key, DigestALGEnum.MD5, "utf-8");
	}

	/**
	 * 放入签名值
	 * @param paramMap数据集合
	 */
	public void putSign(Map<String, String> paramMap) {
		paramMap.put("sign", getSign(paramMap));
	}

	/**
	 * 初始化Map
	 * @return
	 */
	public Map<String, String> instanceMap() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("orderNo", createOrderNo());
		paramMap.put("partnerId", partnerId);
		paramMap.put("inputCharset", "utf-8");
		paramMap.put("signType", DigestALGEnum.MD5.getName()); 
		return paramMap;
	}


	/**
	 * 生成唯一16位流水号
	 * @return 唯一流水号
	 */
	public synchronized String createOrderNo() {
		String orderNo = DateUtil.format(new Date(), "yyMMddHHmmssSSS");
		try {
			Thread.sleep(1);
		} catch (InterruptedException ex) {}
		return "2" + orderNo;
	}


	/**
	 * 发送请求 纯接口式
	 * @param paramMap数据集合
	 * @return 接口返回值
	 */
	public Map<String, String> sendHttpRequest(Map<String, String> paramMap) {
		try {
			log.info("-----------------------------开始请求-----------------------\t");

			/**打印参数**/
			printResult(paramMap, "请求");

			log.info("请求订单号: " + paramMap.get("orderNo"));

			/**发送请求**/
			Map<String, String> dataMap = new SenderHttpRequest().sendPostStreng(paramMap, key, requestUrl);

			if (dataMap == null || dataMap.size() == 0) {
				System.out.println("请查看是否接口关闭或者没有同步返回参数");
			} else {
				// 打印结果信息
				RequestUtil.printResult(dataMap, "结果");
			}
			return dataMap;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}


	/***********************************************************************以下主要用于测试时使用*******************************************/
	/**
	 * 跳转网页式请求
	 * 仅供于测试
	 * @param paramMap
	 */
	@SuppressWarnings("deprecation")
	public void sendRequest(Map<String, String> paramMap) {
		/**放入签名**/
		DigestUtil.digest(paramMap, RequestUtil.key, DigestALGEnum.MD5);

		RequestUtil.printResult(paramMap, "请求");

		String location = requestUrl + "?";
		if (paramMap != null) {
			for (Map.Entry<String, String> entry : paramMap.entrySet()) {
				location += entry.getKey() + "=" + URLEncoder.encode(entry.getValue()) + "&";
			}
		}

		location = location.substring(0, location.length() - 1);
		System.out.println("==本次请求订单号===" + paramMap.get("orderNo"));
		System.out.println("把这个地址放在网页中:\n" + location);
	}

	/**
	 * 输出结果日志
	 * @param dataMap
	 * @param type
	 */
	public static void printResult(Map<String, ? extends Object> dataMap, String type) {
		System.out.println("-----------------"+type+"参数详细如下-----------------");
		for (Map.Entry<String, ? extends Object> entry : dataMap.entrySet()) {
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
		System.out.println("\n\t");
	}
}

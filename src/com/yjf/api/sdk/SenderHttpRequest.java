package com.yjf.api.sdk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 模拟发送HTTP请求
 */
public class SenderHttpRequest {

	private Logger logger = Logger.getLogger(SenderHttpRequest.class);

	/**
	 * 模拟HTTP请求  自动签名
	 * 
	 * @param paramMap  请求发送的所有参数集合
	 * @param securityCheckKey 签名key
	 * @param requestUrl 请求地址
	 * @return 响应结果
	 */
	public Map<String, Object> sendPost(Map<String, String> paramMap, String securityCheckKey, String requestUrl) throws Exception{
		StringBuffer buffer = new StringBuffer();
		try {
			//移除为空的参数
			clearNullValue(paramMap);

			//放入签名值
			digestParam(paramMap, securityCheckKey);

			//参数传送方式
			HttpEntity entity = producePostEntity(paramMap);

			//接收到openapi返回response请求
			HttpResponse response = sendHttp(requestUrl, entity);

			//获取数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));

			String str = null;
			while ((str = reader.readLine()) != null) {
				buffer.append(str);
			}
		} catch (Exception ex) {
			logger.error("发送openAPI异常:", ex);
			throw new Exception("第三方支付接口正在维护中");
		}

		System.out.println(buffer.toString());
		//转化返回数据，返回一个map集合
		return parseJSON(buffer.toString());
	}

	/**
	 * 模拟HTTP请求  自动签名
	 * 
	 * @param paramMap  请求发送的所有参数集合
	 * @param securityCheckKey 签名key
	 * @param requestUrl 请求地址
	 * @return 响应结果
	 */
	public Map<String, String> sendPostStreng(Map<String, String> paramMap, String securityCheckKey, String requestUrl) throws Exception{
		return ConvertUtil.toMapString(sendPost(paramMap, securityCheckKey, requestUrl));
	}

	/**
	 * 移除为空的参数
	 * @param paramMap
	 */
	private void clearNullValue(Map<String, String> paramMap) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>(paramMap);
		for (Entry<String, String> entry : treeMap.entrySet()) {
			if (entry.getValue() == null) {
				paramMap.remove(entry.getKey());
			}
		}
	}

	/**
	 * 加密参数，并把sign参数放入map集合
	 * @param pramMap  加密数据集合
	 * @param securityCheckKey 加密私钥
	 */
	private Map<String, String> digestParam(Map<String, String> paramMap, String securityCheckKey) {
		DigestALGEnum de = DigestALGEnum.getByName(paramMap.get("signType"));
		if (de == null) {
			de = DigestALGEnum.MD5;
		}
		DigestUtil.digest(paramMap, securityCheckKey, de);
		return paramMap;
	}

	/**
	 * 参数传送方式
	 * @param paramMap
	 * @return
	 */
	private HttpEntity producePostEntity(Map<String, String> paramMap) {
		UrlEncodedFormEntity entity = null;
		try {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			for (Map.Entry<String, String> entry : paramMap.entrySet()) {
				params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			entity = new UrlEncodedFormEntity(params, "UTF-8");
		} catch (UnsupportedEncodingException e) { }
		return entity;
	}

	/**
	 * 发送请求至指定地址，并接收返回值
	 * @param uri
	 * @param entity
	 * @return
	 */
	private HttpResponse sendHttp(String uri, HttpEntity entity) throws Exception{
		HttpPost post = new HttpPost(uri);
		post.setEntity(entity);
		HttpClient defaultClient = new DefaultHttpClient();
		HttpResponse response = null;
		try {
			response = defaultClient.execute(post);
		} catch (Exception ex) {
			throw ex;
		} finally {
			//post.releaseConnection();
		}
		return response;
	}

	/**
	 * 将返回字符串转化为Map<String, String>
	 * @param json
	 * @return
	 */
	private static Map<String, Object> parseJSON(String json) {
		Map<String, Object> responseMap = null;
		try {
			if (json != null) {
				responseMap = (Map<String, Object>) JSON.parseObject(json, JSONObject.class);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return responseMap;
	}
}

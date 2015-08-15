package com.yjf.api.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 商户集合
 */
public class Container {

	private static Map<String, String> requestUrlMap = new HashMap<String, String>();
	private static Map<Integer, MerchantInfo> merchantMap = new HashMap<Integer, MerchantInfo>();
	
	static {
		requestUrlMap.put("snet", "http://bornapi.yijifu.net/gateway.html");

		/******----------------------------------------------------------------------------*********/
		merchantMap.put(1, new MerchantInfo("20140411020055682955", "72969e04baa8b6e43fae34e1969d56a6", "公用测试"));
	}
	
	public static MerchantInfo getInfo(int parId) {
		return merchantMap.get(parId);
	}
	
	public static String getRequestUrl(String type) {
		return requestUrlMap.get(type);
	}
}

package com.yjf.api.demo;

import java.util.HashMap;
import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *易周转密码控件
 */
public class yzzPasswordSafe {

	private static String requestUrl = "http://192.168.46.4:8085/userptk/main.htm";
	
	private static String partnerId = "20140411020055682955";
	
	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzPasswordSafe().execute();
	}

	public void execute() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("partnerId", partnerId);
		paramMap.put("signType", "MD5");
		paramMap.put("returnUrl", "http://www.baidu.com");
		paramMap.put("cancelUrl", "http://www.yiji.com");
		
		paramMap.put("origCount", "1");
		paramMap.put("userId", "20141010010000059259");
		
		paramMap.put("sign", new RequestUtil().getSign(paramMap));
		
		RequestUtil.printResult(paramMap, "请求");
		String location = requestUrl + "?";
		if (paramMap != null) {
			for (Map.Entry<String, String> entry : paramMap.entrySet()) {
				location += entry.getKey() + "=" + entry.getValue() + "&";
			}
		}
		location = location.substring(0, location.length() - 1);
		System.out.println("==本次请求订单号===" + paramMap.get("orderNo"));
		System.out.println("把这个地址放在网页中:\n" + location);
	}
}

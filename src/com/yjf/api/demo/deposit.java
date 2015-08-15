package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转网银充值
 */
public class deposit {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new deposit().execute(); 
	}

	public void execute() {
		for (int i = 0; i < 1; i++) {

			//获取基本参数
			RequestUtil util = new RequestUtil();

			Map<String, String> paramMap = util.instanceMap();

			//添加请求参数
			paramMap.put(RequestUtil.SERVICENAME, "deposit");
			paramMap.put("userId", "20150327010000168578");
			//paramMap.put("tradeBizProductCode", "test_deposit");
			paramMap.put("depositAmount", "");
			paramMap.put("payMode", "P");
			paramMap.put(RequestUtil.RETURNNAME, "https://www.yiji.com");
			paramMap.put(RequestUtil.NOTIFYNAME, "https://www.yiji.com");


			//开始请求
			util.sendRequest(paramMap);
		}
	}
}

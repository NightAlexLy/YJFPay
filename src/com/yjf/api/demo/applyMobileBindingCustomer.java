package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 手机绑定
 */
public class applyMobileBindingCustomer {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new applyMobileBindingCustomer().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "applyMobileBindingCustomer");
		paramMap.put("userId", "20150617010000192515");
		paramMap.put("mobile", "18302343390");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

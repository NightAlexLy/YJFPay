package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 更新手机绑定
 */
public class updateMobileBindingCustomer {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new updateMobileBindingCustomer().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "updateMobileBindingCustomer");
		paramMap.put("userId", "20140421010055734808");
		paramMap.put("mobile", "18675871332");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

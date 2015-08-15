package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *找回密码
 */
public class yzzAppForgetPassword{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAppForgetPassword().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		//paramMap.put("userId", "20150505010005260965");
		paramMap.put("passwordType", "payPwd");
		paramMap.put("sources", "APP");
		//paramMap.put("btnColor", "red");
		
	
		//开始请求
		util.sendRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户单独注册
 */
public class userRegister {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new userRegister().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userName", "testmaizi");
		paramMap.put("userType", "P");
		paramMap.put("userStatus", "T");
		
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

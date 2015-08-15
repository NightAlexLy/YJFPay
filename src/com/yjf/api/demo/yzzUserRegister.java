package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户单独注册
 */
public class yzzUserRegister {

	public static void main(String[] args) {
		new yzzUserRegister().execute();
	}

	public void execute() {
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName());
		paramMap.put("userName","test@12309");
		paramMap.put("userType","P");
		paramMap.put("realName","张三");
		paramMap.put("email","644672089@qq.com");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

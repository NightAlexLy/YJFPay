package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户四合一注册
 */
public class yzzUserSpecialRegister{

	public static void main(String[] args) {
		new yzzUserSpecialRegister().execute();
	}

	public void execute() {
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName());
		
		paramMap.put("userName", "test@stanleytam2");
		paramMap.put("userType", "P");
		paramMap.put("realName", "蒋先生");
		paramMap.put("email", "644672089@qq.com");
		paramMap.put("mobile", "18675871332");
		paramMap.put("certValidTime", "2020-01-02");
		paramMap.put("certNo", "431028198911114014");
		paramMap.put("isMainland", "N");
		
		//请求
		util.sendHttpRequest(paramMap);
	}
}

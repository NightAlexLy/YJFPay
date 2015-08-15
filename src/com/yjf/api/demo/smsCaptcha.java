package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 短信发动验证服务
 */
public class smsCaptcha {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new smsCaptcha().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "smsCaptcha");
		paramMap.put("userId", "20140421010055734136");
		paramMap.put("smsContext", "你好，此次验证码为C，如不是本人操作请勿回复");  //这个C不能变,易极付会自动将C替换成验证码

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

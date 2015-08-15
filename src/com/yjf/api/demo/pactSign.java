package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 执行签约
 */
public class pactSign {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new pactSign().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		paramMap.put("tradeNo", "EN22njBS6dOD");
		paramMap.put("pactType", "upmp");
		paramMap.put("mobileCode", "888888");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

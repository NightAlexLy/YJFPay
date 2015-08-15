package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户信息查询
 */
public class yzzUserAccountQuery {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzUserAccountQuery().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "yzzUserAccountQuery");
		paramMap.put("userId", "20150505010005260965");   //注册时返回的
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

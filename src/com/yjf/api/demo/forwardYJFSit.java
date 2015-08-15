package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转易极付官网
 */
public class forwardYJFSit {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new forwardYJFSit().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "forwardYJFSit");
		paramMap.put("userId", "20150327010000168578");
		
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

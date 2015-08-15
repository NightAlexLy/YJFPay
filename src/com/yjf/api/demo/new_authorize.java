package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转实名
 */
public class new_authorize {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new new_authorize().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName());
		paramMap.put("userId", "20150709010000052108");

		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *使用预授权
 */
public class yzzUseUserAuthorize{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzUseUserAuthorize().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("authorizeNo", "NO2150616172017545");
		paramMap.put("executeAmount", "20");
		paramMap.put("payeeUserId", "123456789999999999");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

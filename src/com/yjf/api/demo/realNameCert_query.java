package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *实名状态查询服务
 *只能查询通过单独实名认证接口认证的数据,通过yzzUserSpecialRegister接口的无法查询
 */
public class realNameCert_query {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new realNameCert_query().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "realNameCert.query");
		paramMap.put("userId", "20140421010055734808");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

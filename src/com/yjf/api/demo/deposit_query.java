package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 充值纪录查询
 */
public class deposit_query {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new deposit_query().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "deposit.query");
		paramMap.put("userId", "20141125010002826621");
//		paramMap.put("pageSize", "12");
		paramMap.put("status", "SUCCESS");
		
		//paramMap.put("startTime", "2014-10-24 00:00:00");
		//paramMap.put("endTime", "2014-10-24 00:00:01");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

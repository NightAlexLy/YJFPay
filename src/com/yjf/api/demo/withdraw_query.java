package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 提现纪录查询
 */
public class withdraw_query {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new withdraw_query().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150119010000106871");
		paramMap.put("currPage", "1");
		//paramMap.put("status", "SUCCESS");
		//paramMap.put("withdrawId", "20141208520058998950");
		
		//paramMap.put("startTime", "2014-12-21 00:00:00");
		//paramMap.put("endTime", "2015-01-21 15:28:45");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

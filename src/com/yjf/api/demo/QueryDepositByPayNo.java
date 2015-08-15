package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 根据充值流水号查询充值记录服务
 */
public class QueryDepositByPayNo {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new QueryDepositByPayNo().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName());
		paramMap.put("depositId", "20140423510055739694");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

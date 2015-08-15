package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *导出提现或充值数据为excel
 */
public class yzzExportData {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzExportData().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("startTime", "2014-11-24 12:19:44");
		paramMap.put("endTime", "2015-01-10 12:19:55");
		paramMap.put("exportType", "DEPOSIT");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

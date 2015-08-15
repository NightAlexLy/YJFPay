package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 单个交易查询
 */
public class tradeQuery {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeQuery().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "150327143923135bbab6542");
		paramMap.put("tradeType", "POOL_TOGETHER");
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 自动投标
 */
public class yzzAutoBidTrade {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAutoBidTrade().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "1411181636159570aeaf708");
		paramMap.put("payerUserId", "20141118010000074092");
		paramMap.put("tradeAmount", "10");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

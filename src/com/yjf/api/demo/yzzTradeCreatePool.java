package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 流转标create
 */
public class yzzTradeCreatePool {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzTradeCreatePool().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("sellerUserId", "20140421010055734808");
		paramMap.put("tradeBizProductCode", "test_deposit");
		paramMap.put("product", "pool");
		paramMap.put("tradeType", "POOL");
		paramMap.put("gatheringType", "SERVICE_BUY");
		paramMap.put("tradeAmount", "20");
		paramMap.put("buyerMarkerMemo", "");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL + "lzb");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

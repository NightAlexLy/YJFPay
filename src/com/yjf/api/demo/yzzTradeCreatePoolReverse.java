package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 集资还款交易的创建
 */
public class yzzTradeCreatePoolReverse {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzTradeCreatePoolReverse().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("payerUserId", "20150327010000168578");
		paramMap.put("tradeBizProductCode", "20130326_together");
		paramMap.put("tradeAmount", "1000");
		paramMap.put("tradeName", "还款交易");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 给力式交易创建
 */
public class yzzTradeCreatePoolTogether {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzTradeCreatePoolTogether().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("sellerUserId", "20141106010000066744");    //借款人
		paramMap.put("tradeBizProductCode", "20130326_together");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);   
		paramMap.put("tradeAmount", "60000");
		paramMap.put("tradeName", "这是我的专用测试标");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

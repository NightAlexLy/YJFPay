package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 债权转让交易创建
 */
public class yzzTradeCreateShareTogether {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzTradeCreateShareTogether().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		paramMap.put("refTradeNo", "150410181306734391df169");
		paramMap.put("refSubTradeNo", "150410181432982495b1650");
		paramMap.put("sellerUserId", "20150327010000168580");    //借款人
		paramMap.put("tradeBizProductCode", "20130326_together");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);   
		paramMap.put("tradeAmount", "90");
		paramMap.put("tradeName", "1000");
		paramMap.put("tradeMemo", "1000");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

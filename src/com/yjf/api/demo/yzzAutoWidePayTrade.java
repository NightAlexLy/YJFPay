package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 自动还款
 */
public class yzzAutoWidePayTrade {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAutoWidePayTrade().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "14111911063503196bdccfd");
		paramMap.put("refTradeNo", "1411181636159570aeaf708");
		paramMap.put("payerUserId", "20141119010000074330");
		

		String subOrders = "[{\"orderNo\" : \""+util.createOrderNo()+"\", \"tradeName\": \"还款\", \"payerUserId\" : \"20141119010000074330\", \"payeeUserId\" : \"20141118010000074092\", \"transferAmount\" : \"50\"}]";
		

		String shardOrders = "{\"orderNo\" : \""+util.createOrderNo()+"\", \"tradeName\": \"还款\", \"payerUserId\" : \"20141119010000074330\", \"payeeUserId\" : \"20141013010000059485\", \"transferAmount\" : \"60\"}";
		
		paramMap.put("subOrders", subOrders);
		paramMap.put("shardOrder", shardOrders);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

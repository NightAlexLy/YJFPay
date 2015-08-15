package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 给力式集体付款
 */
public class tradePayPoolTogether {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradePayPoolTogether().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "1504101825350800a0da59b");
		/*String tradeOrders = "[{\"orderNo\" : \" " + util.createOrderNo() + "\", " +
				"\"payerUserId\" : \"20140421010055734808\", " +
				"\"payeeUserId\":\"20140430010000002822\", \"transferAmount\":\"50\"}]";
		paramMap.put("tradePoolSubTansferOrders", tradeOrders);   //分润用户信息，不是投资人的信息*/
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

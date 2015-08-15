package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户缴纳保证金
 */
public class yzzPaymentBond {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzPaymentBond().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		paramMap.put("payerUserId", "20150227010000135734");

		paramMap.put("payerMoney", "90");

		paramMap.put("tradeNo", "1411131103330415b1384d3");

		paramMap.put("partnerName", "test");

		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

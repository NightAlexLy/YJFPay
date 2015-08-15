package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 发送红包
 */
public class yzzSendBonus {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzSendBonus().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("payerUserId", "20140411020055682955");
		paramMap.put("payeeUserId", "20141011010000059403");
		paramMap.put("transferMoney", "10");
		paramMap.put("memo", "派个小红包");
		paramMap.put("expDate", "2015-11-20");
		paramMap.put("orderNo", "2141118145705342");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

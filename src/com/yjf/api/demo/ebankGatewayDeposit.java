package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *模板
 */
public class ebankGatewayDeposit{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new ebankGatewayDeposit().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		
		paramMap.put("userId", "20140411020055682955");
		paramMap.put("amount", "2000");
		paramMap.put("bankCode", "ICBC");
		//paramMap.put("tradeMerchantId", "20140411020055682955");
		
		paramMap.put("publicTag", "B2C");
		
		paramMap.put(RequestUtil.RETURNNAME, "http://bornfinance.yijifu.net/returnPage/successOrFail.html");
		paramMap.put(RequestUtil.NOTIFYNAME, "http://bornfinance.yijifu.net/returnPage/notifyResult.html");
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

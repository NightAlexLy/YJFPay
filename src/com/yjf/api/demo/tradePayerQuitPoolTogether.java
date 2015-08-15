package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 申请退出集资
 */
public class tradePayerQuitPoolTogether {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradePayerQuitPoolTogether().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "1504300918579146f6156bf");                 //创建返回的交易号
		paramMap.put("subTradeNo", "150430092335196f4b0b831");	          //投资时返回的子交易号



		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

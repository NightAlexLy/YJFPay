package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

public class trade_pool_transfer2p {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new trade_pool_transfer2p().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("payeeUserId", "20150107010003654901");
		paramMap.put("tradeNo", "150507161107995a8e83340");
		paramMap.put("transName", "转入监管账户并到卡");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

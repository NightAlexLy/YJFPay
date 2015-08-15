package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 集资还款交易完成
 */
public class tradeFinishPoolReverse {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeFinishPoolReverse().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "20150127000015727775");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 给力式集资交易关闭
 */
public class tradeClosePoolTogether {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeClosePoolTogether().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "150327144934605ed01b0e0");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

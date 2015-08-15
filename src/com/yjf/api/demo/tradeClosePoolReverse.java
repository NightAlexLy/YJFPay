package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 集资还款交易关闭
 */
public class tradeClosePoolReverse {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeClosePoolReverse().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "20140429000000240148");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

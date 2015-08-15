package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *模板
 */
public class trc_borrow_effect{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new trc_borrow_effect().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150106010003637243");
		paramMap.put("tradeNo", "20141024163618471d692f7eb");
		paramMap.put("effectDate", "2015-04-24 16:55:30");
		paramMap.put("planReverseDate", "2015-04-24 16:55:30");
		paramMap.put("effectAmount", "2200000");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

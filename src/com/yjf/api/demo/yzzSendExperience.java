package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 发放体验金
 */
public class yzzSendExperience {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzSendExperience().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("payerUserId", "20140411020055682955");
		paramMap.put("payeeUserId", "20150424010000175813");
		paramMap.put("transferMoney", "1000");
		paramMap.put("memo", "派个小红包");
		paramMap.put("expDate", "2015-11-20");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

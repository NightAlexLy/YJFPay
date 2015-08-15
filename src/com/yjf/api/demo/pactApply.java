package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 申请签约
 */
public class pactApply {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new pactApply().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		paramMap.put("userId", "20150709010000052108");
		paramMap.put("cardName", "刘漠辉");
		//paramMap.put("cardType", "DEBIT_CARD_TYPE");
		paramMap.put("cardNo", "6222023602097746182");
		paramMap.put("certNo", "431028198912054014");
		//paramMap.put("certType", "Identity_Card");
		paramMap.put("userPhoneNo", "18675871332");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

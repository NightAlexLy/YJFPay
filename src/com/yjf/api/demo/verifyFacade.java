package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *验证银行卡
 *支持的银行 :  农行、建行、光大、民生、农商行、邮政、兴业、招行、浦发、平安、工行、中信
 */
public class verifyFacade {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new verifyFacade().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "verifyFacade");
		paramMap.put("bankCode","CCB");
		paramMap.put("accountName","张志军");
		paramMap.put("accountNo","6227002960410130278");
		paramMap.put("certNo","430530198409033012");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

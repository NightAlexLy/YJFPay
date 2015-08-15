package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 短信验证
 */
public class smsConfirmVerifyCode {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new smsConfirmVerifyCode().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "smsConfirmVerifyCode");
		paramMap.put("checkCodeString", "");
		paramMap.put("checkCodeUniqueId", "paycore.customer.verifyCodeUniqueId1409740139576108");  //由发送短信同步返回参数中得来

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

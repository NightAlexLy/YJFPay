package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 短信发送
 */
public class sms {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new sms().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("strategy", "smsExpand");            
		paramMap.put("phoneNos", "18675871332");
		paramMap.put("smsContext", "测试后缀名");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

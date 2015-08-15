package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 短信发送服务
 */
public class shortMessageSend {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new shortMessageSend().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("mobileNos", "['18675871332','15523836745']");
		paramMap.put("smsContent", "测试短信2!");
		//paramMap.put("suffix", "[易极付]");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

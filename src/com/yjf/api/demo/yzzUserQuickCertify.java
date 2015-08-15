package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *用户快速实名认证
 */
public class yzzUserQuickCertify{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzUserQuickCertify().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("realName", "张三");
		paramMap.put("certNo", "431028198912054015");
		paramMap.put("userId", "20150710010000052115");
		paramMap.put("certValidTime", "20190102");
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

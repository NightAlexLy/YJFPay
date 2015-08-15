package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转修改密码
 */
public class yzzModifyPassword {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzModifyPassword().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150515010005422855");
		paramMap.put("passwordType", "all");
		//paramMap.put("sources", "APP");
		//paramMap.put("btnColor", "@2E90FF");


		//开始请求
		util.sendRequest(paramMap);
	}
}

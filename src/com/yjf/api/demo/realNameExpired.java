package com.yjf.api.demo;

import java.util.HashMap;
import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 实名认证过期
 */
public class realNameExpired {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new realNameExpired().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = new HashMap<String, String>();

		//添加请求参数
		
		paramMap.put("userId", "20140728010000047471");
		paramMap.put("status", "expire");
		paramMap.put("signType", "MD5");
		paramMap.put("notifyTime", "2014-08-04 13:37:20");
		
	             
		//开始请求
		util.sendRequest(paramMap);
	}
}

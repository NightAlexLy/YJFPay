package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户实名等级查询
 */
public class userInfoQuery {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new userInfoQuery().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20141106010000066770");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

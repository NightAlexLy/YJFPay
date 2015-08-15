package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 用户实名认证等级查询
 */
public class yzzUserCertLevelQuery {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzUserCertLevelQuery().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150709010000052108");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 查询体验金
 */
public class yzzQueryExperience {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzQueryExperience().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("payeeUserId", "20141011010000059403");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

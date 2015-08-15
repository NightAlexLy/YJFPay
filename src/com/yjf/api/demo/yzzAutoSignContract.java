package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 自动投标签约
 */
public class yzzAutoSignContract {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAutoSignContract().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		//添加请求参数
		paramMap.put(RequestUtil.NOTIFYNAME, "https://www.yiji.com");
		paramMap.put(RequestUtil.RETURNNAME, "https://www.yiji.com");

		paramMap.put("userId", "20150327010000168601");
		paramMap.put("opType", "SAVE");  //
		paramMap.put("pactType", "2");
		paramMap.put("partnerName", "理财中国");
		paramMap.put("sources", "APP");
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

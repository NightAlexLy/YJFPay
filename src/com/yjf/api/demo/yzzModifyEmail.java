package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 修改用户邮箱
 */
public class yzzModifyEmail{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzModifyEmail().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150327010000168578");
		paramMap.put("email", "644672089@qq.com");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

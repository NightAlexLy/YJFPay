package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 关联认证注册
 */
public class forwardConIdentify {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args){
		new forwardConIdentify().execute();
	}

	public void execute(){
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userName", "nz_l3geeq90");
		paramMap.put("userType", "P");
		//paramMap.put("requestTag", "y8");
		//paramMap.put("realName", "张三");
		//paramMap.put("certNo", "500239199301034112 ");
		//paramMap.put("email", "644672089@qq.com");
		
		//paramMap.put("mobile", "18675871332");
		
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);

		//开始请求
		util.sendRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *跳转激活
 *这个是跳转网页的(即含有易极付页面),涉及页面的主要有
 *    1.充值跳转收银台
 *    2.跳转官网
 *    3.给力式集资付款跳转收银台
 *    4.流标式集资付款跳转收银台
 *    5.集资还款跳转收银台
 *    6.关联认证用户注册
 *    7.跳转激活
 *    8.跳转到签约平台
 *    9.跳转查看签约明细
 */
public class yzzActivate {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzActivate().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "yzzActivate");
		paramMap.put("userId", "20150327010000168578");
		
		paramMap.put("returnUrl", RequestUtil.RETURNURL);
		paramMap.put("sources", "APP");
		paramMap.put("btnColor", "red");
		paramMap.put("needLoginPwd", "N");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

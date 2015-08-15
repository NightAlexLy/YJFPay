package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转PPM提现
 */
public class ppmStrengthenWithdraw  {

	/**
	 * 入口点
	 */
	public static void main(String[] args) {
		new ppmStrengthenWithdraw().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();
		
		//添加请求参数                  (提现)
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20140825010000053860");
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		paramMap.put("delay", "0");
		paramMap.put("payMode", "U");
		
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

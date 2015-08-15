package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 易周转-新提现
 */
public class yzzNewWithraw {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzNewWithraw().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		    
		paramMap.put("userId", "20150507010000178605");
		paramMap.put("bankAccountNo", "6222023602097746151");
		paramMap.put("bankProvName", "广东省");
		paramMap.put("bankCityName", "广州市");
		paramMap.put("money", "9000");
		paramMap.put("bankCode", "ICBC");
		
		//paramMap.put("certNo", "431028891205401");
		
		paramMap.put("payMode", "P");   //付费方
		paramMap.put("delay", "0");    //提现方式

		
		
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);   //异步通知地址

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

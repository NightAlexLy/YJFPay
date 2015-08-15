package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 易周转-代扣
 * 调用该接口必需先调用签约接口(跳转代扣签约或者跳转签约平台),还需要易极付添加当前测试平台商对应的扣费规则
 */
public class yzzNewDeduct {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzNewDeduct().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		
		
		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150327010000168578");
		
		paramMap.put("money", "60000");
		paramMap.put("bankAccountNo", "6222023602099746150");
		paramMap.put("bankCode", "ICBC");
		paramMap.put("owner", "yjf");
		paramMap.put("payMode", "U");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

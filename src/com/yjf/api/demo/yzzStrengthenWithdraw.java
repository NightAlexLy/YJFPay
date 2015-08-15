package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 提现
 */
public class yzzStrengthenWithdraw {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzStrengthenWithdraw().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		paramMap.put("userId", "20150424010000175813");
		//paramMap.put("money", "500000");
		
		paramMap.put("payMode", "P");
		paramMap.put("delay", "0");
		
		paramMap.put("cardNo", "6222023602097746182");
		paramMap.put("bankCode", "ICBC");
		
		paramMap.put("province", "贵州省");
		
		paramMap.put("city", "贵阳市");
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

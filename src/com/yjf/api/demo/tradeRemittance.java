package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *模板
 */
public class tradeRemittance{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeRemittance().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		//paramMap.put("tradeName", "tradeName");
		paramMap.put("userId", paramMap.get("partnerId"));
		paramMap.put("realName", "张四");
		paramMap.put("tradeAmount", "50.67");
		paramMap.put("tradeMemo", "我要提现");
		//paramMap.put("delayHours", "0");
		//paramMap.put("chargeFrom", "BUYER");
		paramMap.put("bankAccountNo", "6222023602097746134");
		paramMap.put("bankAccountName", "张三");
		//paramMap.put("bankAddress", "中国");
		paramMap.put("provName", "广东省");
		paramMap.put("cityName", "广州市");
		paramMap.put("bankCode", "ICBC");
		//paramMap.put("outOrderNo", paramMap.get("orderNo"));
		paramMap.put("publicTag", "N");

		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

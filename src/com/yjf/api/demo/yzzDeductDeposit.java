package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 异步代扣充值服务
 */
public class yzzDeductDeposit {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzDeductDeposit().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20140910010000052286");
		paramMap.put("amount", "20");
		paramMap.put("certNo", "431028198912054014");
		paramMap.put("provName", "广东省");
		paramMap.put("cityName", "广州市");
		paramMap.put("bankCode", "ICBC");
		paramMap.put("bankAccountNo", "6222023602097746150");
		paramMap.put("bankAccountName", "刘漠辉");
		paramMap.put("publicTag", "N");
		paramMap.put("tradeBizProductCode", "test_deposit");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

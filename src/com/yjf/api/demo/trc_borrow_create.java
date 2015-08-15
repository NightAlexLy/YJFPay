package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *模板
 */
public class trc_borrow_create{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new trc_borrow_create().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150106010003637243");
		paramMap.put("tradeNo", "20141024163618471d692f7eb");
		paramMap.put("tradeName", "琦祥之星【2015】001[TEST]");
		paramMap.put("tradeDesc", "琦祥之星【2015】001");
		paramMap.put("borrowAmount", "2200000");
		paramMap.put("period", "1");
		paramMap.put("periodType", "MONTH");
		
		paramMap.put("annualRate", "0.1");
		paramMap.put("refundType", "ONE_ALL_RETURN");

		paramMap.put("guaranteeUserId", "20141211020003207707");
		paramMap.put("guaranteeUserName", "河南易七");
		paramMap.put("commitment", "担保公司[TEST]");
		
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

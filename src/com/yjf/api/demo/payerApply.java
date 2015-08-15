package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 给力式集资交易跳转收银台
 */
public class payerApply {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new payerApply().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "1504241133042970dd6dbf7");      //交易创建返回的交易号
		paramMap.put("payerUserId", "20141011010000059403");   //投资人ID
		paramMap.put("tradeAmount", "1000");
		paramMap.put("tradeMemo", "xiao");
		paramMap.put("tradeName", "d");
		//paramMap.put("useBlack", "Y");
		paramMap.put("useRed", "Y");
		paramMap.put("redAmount", "9.9");
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);

		
		//开始请求
		util.sendRequest(paramMap);
	}
}

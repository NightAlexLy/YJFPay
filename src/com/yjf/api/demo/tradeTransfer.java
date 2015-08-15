package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 站内转账
 */
public class tradeTransfer {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradeTransfer().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("buyerUserId", "20141112010000069322");   //付款方
		paramMap.put("sellerUserId", "20141112010000069325");   //收款方
		paramMap.put("tradeAmount", "3838");					//转账金额
		//paramMap.put("unFreezeType", "YZZ_GUARANTEE_FREEZE");   //解冻码
		//paramMap.put("unfreezeAmount", "100");					//解冻金额
		paramMap.put("tradeMemo", "易九退还多收用户手续费");	    //描述
		//paramMap.put("transferAction", "UN_FREEZE_TRANSFER");   //类型，指明要先解冻，后转账
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

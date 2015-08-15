package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *带token的冻结
 */
public class yzzAccountFreezePtk{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAccountFreezePtk().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20141215010000097062");
		paramMap.put("payToken", "e071e9b43cecd00c78fb63d4788020287d420007061b2b02242b75bfc12adb09");
		paramMap.put("freezeAmount", "20");  
		paramMap.put("outBizNo", paramMap.get("orderNo"));
		paramMap.put("freezeCode", "ESCROW_FREEZE");
		paramMap.put("memo", "");
		paramMap.put("tradeNo", "");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 保存充值数据
 */
public class yzzSaveDepositData {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzSaveDepositData().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		//paramMap.put("payOrderNo", "1412171558710036");
		paramMap.put("userId", "20141124010000088242");
		paramMap.put("payMode", "P");
		paramMap.put("delay", "0");
		paramMap.put("depositCode", "W");
        paramMap.put("payNo", "20141231510059085544");


		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

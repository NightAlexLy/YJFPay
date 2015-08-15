package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 及时到账
 */
public class fastpay {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new fastpay().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		paramMap.put("payerUserId", "20150327010000168578");
		
		paramMap.put("payeeUserId", "20140411020055682955");
		
		paramMap.put("bizProductCode", "test_deposit");

		paramMap.put("transferAmount", "15.42");
		
		paramMap.put("transferMemo", "因系统缺陷引起的分润错误，归还多余款项");
		
		paramMap.put(RequestUtil.RETURNNAME, "http://www.yiji.com");

		paramMap.put(RequestUtil.NOTIFYNAME, "http://www.yiji.com");
		
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

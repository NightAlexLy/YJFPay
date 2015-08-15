package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 跳转到签约平台
 */
public class signmanybank {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new signmanybank().execute(); 
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();

		for(int i =0; i < 4; i++) {
			Map<String, String> paramMap = util.instanceMap();

			//添加请求参数
			paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
			paramMap.put("userId", "20150709010000052108");

			paramMap.put("cardNo", "6222023602097746555");
			paramMap.put("bankNo", "ICBC");

			paramMap.put("unionBusinessNo", "easy_trade-yxyt");


			paramMap.put("returnUrl", RequestUtil.RETURNURL);
			//开始请求
			util.sendRequest(paramMap);
		}
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 添加银行卡绑定
 */
public class bankCodeBinding_addInfo {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new bankCodeBinding_addInfo().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "bankCodeBinding.addInfo");
		paramMap.put("userId","20150402010004739727");
		paramMap.put("bankCardNo","6222023602097746150");
		paramMap.put("bankType","ICBC");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

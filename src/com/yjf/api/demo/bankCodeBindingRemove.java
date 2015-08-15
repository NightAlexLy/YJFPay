package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 解除银行卡的绑定信息
 */
public class bankCodeBindingRemove {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new bankCodeBindingRemove().execute();
	}

	public void execute() throws Exception{
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "bankCodeBindingRemove");
		paramMap.put("userId", "20140813010000051921");
		paramMap.put("bankCardNo", "6222023602097746151");

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

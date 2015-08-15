package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 网关模式签约
 */
public class gatewayPactApply{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new gatewayPactApply().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("cardNo", "6222023602097746158");
		paramMap.put("certNo", "431028198912054016");
		paramMap.put("realName", "张三");
		paramMap.put("userPhoneNo", "18675871332");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

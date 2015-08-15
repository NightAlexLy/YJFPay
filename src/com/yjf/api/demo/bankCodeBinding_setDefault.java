package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 设置银行卡默认绑定
 */
public class bankCodeBinding_setDefault {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new bankCodeBinding_setDefault().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "bankCodeBinding.setDefault");
		paramMap.put("userId","20140421010055734136");
		paramMap.put("bankCardNo","6222023602097746150");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

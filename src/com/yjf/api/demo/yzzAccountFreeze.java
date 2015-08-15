package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 资金冻结
 */
public class yzzAccountFreeze {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzAccountFreeze().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));

		paramMap.put("memo", "银多快乐贷投资冻结TEST");
		paramMap.put("freezeAmount", "100.00");
		paramMap.put("accountNo", "20141014010000059621");
		//paramMap.put("freezeType", "YZZ_GUARANTEE_FREEZE");

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

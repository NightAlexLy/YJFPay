package com.yjf.api.demo;

import java.util.Date;
import java.util.Map;

import com.yjf.api.util.DateUtil;
import com.yjf.api.util.RequestUtil;

/**
 * 通用提现
 */
public class yjfWithdraw {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yjfWithdraw().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20141215010000097062");
		paramMap.put("outOrderNo", paramMap.get("orderNo"));
		paramMap.put("loginId", "test@testemail37");
		paramMap.put("requestTime", DateUtil.format(new Date(), "yyyyMMddHHmmss"));
		paramMap.put("returnUrl", "http://www.baidu.com");
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *预授权
 */
public class yzzUserAuthorize{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzUserAuthorize().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("partnerName", "保护网");
		paramMap.put("authorizeMemo", "收保护费");
		paramMap.put("authorizeAmount", "54.00");
		paramMap.put("userId", "20150327010000168578");
		paramMap.put("authorizeType", "FREEZE");
		
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);
		
		//开始请求
		util.sendRequest(paramMap);
	}
}

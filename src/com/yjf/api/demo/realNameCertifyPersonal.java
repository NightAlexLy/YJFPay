package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 个人用户实名认证
 */
public class realNameCertifyPersonal{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new realNameCertifyPersonal().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("userId", "20150114010000105966");

		paramMap.put("certFrontPath", "http://www.baidu.com");
		paramMap.put("certBackPath", "http://www.baidu.com");
		paramMap.put("realName", "张三");
		paramMap.put("certType", "Identity_Card");
		paramMap.put("certNo", "431028198912054014");
		paramMap.put("certValidTime", "20150809");
		
		paramMap.put("occupation", "J");
		paramMap.put("address", "重庆卡卡角里");
		paramMap.put("mobileNo", "18675871332");

		paramMap.put("notifyUrl", RequestUtil.NOTIFYURL);

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 企业实名认证
 */
public class yzzBusinessRealNameCert {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzBusinessRealNameCert().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "yzzBusinessRealNameCert");
		paramMap.put("comCycle", "0");
		paramMap.put("comName", "易极付公司Test");
		paramMap.put("conCardid", "431028198912054014");
		paramMap.put("conMobile", "18675871332");
		paramMap.put("conName", "刘漠辉");
		paramMap.put("conPhone", "020-5478451");
		paramMap.put("licence", "http://a.hiphotos.baidu.com/image/w%3D2048/sign=4958ebe034d3d539c13d08c30ebfe850/203fb80e7bec54e7b663d100bb389b504fc26a25.jpg");
		paramMap.put("licencenum", "45454545454545");
		paramMap.put("taxAuthority", "4545457894112");
		paramMap.put("nickname", "刘漠辉");
		paramMap.put("organizationcode", "456");
		paramMap.put("legalPersonCardPic", "http://a.hiphotos.baidu.com/image/w%3D2048/sign=4958ebe034d3d539c13d08c30ebfe850/203fb80e7bec54e7b663d100bb389b504fc26a25.jpg");
		paramMap.put("legalPersonCardPic1", "http://a.hiphotos.baidu.com/image/w%3D2048/sign=4958ebe034d3d539c13d08c30ebfe850/203fb80e7bec54e7b663d100bb389b504fc26a25.jpg");
		paramMap.put("legalPersonCardType", "2");
		paramMap.put("legalPersonCardOff", "0");
		paramMap.put("legalPersonCardid", "431028198912054014");
		paramMap.put("isLegalPerAudit", "N");
		paramMap.put("source", "1");
		paramMap.put("coreCustomerUserId", "20140421010055734808");   //注册企业用户时返回的ID
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);

		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

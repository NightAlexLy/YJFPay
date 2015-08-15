package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 个人实名认证服务
 */
public class yzzPersonalRealNameCert {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzPersonalRealNameCert().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName());
		paramMap.put("realName", "刘漠辉");
		paramMap.put("cardid", "431028198912054014");
		//图片地址需外网可以访问,测试环境随便传
		paramMap.put("cardpic", "http://a.hiphotos.baidu.com/image/w%3D2048/sign=4958ebe034d3d539c13d08c30ebfe850/203fb80e7bec54e7b663d100bb389b504fc26a25.jpg");
		paramMap.put("cardpic1", "http://a.hiphotos.baidu.com/image/w%3D2048/sign=4958ebe034d3d539c13d08c30ebfe850/203fb80e7bec54e7b663d100bb389b504fc26a25.jpg");
		paramMap.put("cardoff", "2017-08-08");
		//paramMap.put("userId", "20140421010055734808");
		paramMap.put("userId", "20140425010000002550");
		//paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		paramMap.put(RequestUtil.NOTIFYNAME, "http://192.168.55.30:8080/TestWsDemo/servlet/TestResponseNotice");
		

		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

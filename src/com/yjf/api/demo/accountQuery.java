package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 查询账户的交易明细
 */
public class accountQuery  {

	/**
	 * 入口点
	 */
	public static void main(String[] args) {
		new accountQuery().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数                  (新实名认证)
		paramMap.put(RequestUtil.SERVICENAME, "account_query_pr_detail");
		/*
		 个人：
		 http://192.168.45.35:8121/index/index.htm?userId=20140508010000000147
		 http://192.168.45.35:8121/index/index.htm?userId=20140508010000000149
		 http://192.168.45.35:8121/index/index.htm?userId=20140508010000000151
		 http://192.168.45.35:8121/index/index.htm?userId=20140508010000000153

		 企业：
		 http://192.168.45.35:8121/index/index.htm?userId=20140508020000000171
		 */

		paramMap.put("userId", "20140411010055683015");
		paramMap.put("beginDate", "2014-3-1");
		paramMap.put("endDate", "2014-04-30");
		paramMap.put("pageNo", "1");
		paramMap.put("pageRowCount", "100");
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);

		//开始请求
		Map<String, String> x = util.sendHttpRequest(paramMap);
		int i = 2;
		while ("true".equals(x.get("hasNextPage"))) {
			System.out.println("取下一页 pageNo =>>>> " + i);
			paramMap.put("pageNo", String.valueOf(i));
			x = util.sendHttpRequest(paramMap);
			++i;
		}

	}
}

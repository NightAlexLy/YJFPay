package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 *模板
 */
public class trc_borrow_add_investment{

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new trc_borrow_add_investment().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		
		paramMap.put("items", "[{\"memo\":\"投资\",\"investDate\":\"2015-06-04 09:42:55\",\"outBizNo\":\"20150603094013923749_invest104_1\",\"investUserId\":\"20150602010005702426\",\"investAmount\":\"100.00\"}]");
					paramMap.put("tradeNo", "559");
						paramMap.put("userId", "20150529010005653036");
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

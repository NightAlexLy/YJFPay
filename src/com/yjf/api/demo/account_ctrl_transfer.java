package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 内控站内转账
 */
public class account_ctrl_transfer {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new account_ctrl_transfer().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		
		/**单笔交易
			paramMap.put("ctrlTransferType", "20140411020055682955");
	
			paramMap.put("tradeName", "test");
			
			paramMap.put("payerUserId", "20140411020055682955");
			
			paramMap.put("sellerUserId", "20141024010000061869");
			
			paramMap.put("tradeBizProductCode", "20130326_reverse");
	
			paramMap.put("tradeAmount", "50");
			
			paramMap.put("transferMemo", "xx");
		**/
		
		/**多笔交易 **/
		paramMap.put("ctrlTransferType", "20140411020055682955");
		paramMap.put("tradeName", "test");
		paramMap.put("payerUserId", "20140411020055682955");
		paramMap.put("tradeBizProductCode", "20130326_reverse");
		
		String context = "[{'orderNo':'"+util.createOrderNo()+"', 'tradeAmount':'12.40', 'sellerUserId':'20150327010000168578', 'tradeMemo':'经纪人分润'}, {'orderNo':'"+util.createOrderNo()+"', 'tradeAmount':'12.55', 'sellerUserId':'20150327010000168578', 'tradeMemo':'经纪人分润'}]";
		
		
		paramMap.put("transferOrders", context);
		paramMap.put(RequestUtil.NOTIFYNAME, RequestUtil.NOTIFYURL);
		
		//开始请求
		util.sendHttpRequest(paramMap);
	}
}

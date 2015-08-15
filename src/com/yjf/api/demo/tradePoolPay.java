package com.yjf.api.demo;

import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 集资还款跳转收银台
 */
public class tradePoolPay {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new tradePoolPay().execute();
	}

	public void execute() {
		//获取基本参数
		RequestUtil util = new RequestUtil();

		Map<String, String> paramMap = util.instanceMap();

		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
		paramMap.put("tradeNo", "14111911045649928c4229a");
		paramMap.put("payerUserId", "20150327010000168578");
		paramMap.put("tradeAmount", "200");
		paramMap.put("refTradeNo", "1411181636159570aeaf708");
		paramMap.put(RequestUtil.RETURNNAME, RequestUtil.RETURNURL);

		//20140430010000002822这是分润账号
		//20140421010055734808这是投资人的账号,本来投了九百,但加上利息就要给一千

		//String subOrders = "[{\"orderNo\" : \""+util.createOrderNo()+"\", \"payerUserId\" : \"20141127020002888708\", \"payeeUserId\" : \"20141225010003500905\", \"transferAmount\" : \"100\"}]";

		String subOrders ="[";
		int size = 1;
		for (int i = 0; i < size; i++) {
			subOrders += "{\"orderNo\" : \""+util.createOrderNo()+"\", \"payerUserId\" : \"20140421010055734136\", \"payeeUserId\" : \"20141118010000074092\", \"transferAmount\" : \"1000\"}";
			if (i < size -1) {
				subOrders += ",";
			}
		}
		subOrders += "]";

		paramMap.put("subOrders", subOrders);
		paramMap.put("useMobileCheck", "Y");

		//开始请求
		util.sendRequest(paramMap);

		/*for(Map.Entry<String, String> entry : paramMap.entrySet()){
			System.out.println("<input type='text' name='" + entry.getKey() + "' value='" + entry.getValue() + "'/>");
		}*/

		
		/*paramMap.put("sign", util.getSign(paramMap));


		StringBuffer  buffer = new StringBuffer();
		buffer.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		buffer.append("<html>");
		buffer.append("	<head>");

		buffer.append("		<title>请求提交中</title>");
		buffer.append("		<meta http-equiv=\"pragma\" content=\"no-cache\">");
		buffer.append("		<meta http-equiv=\"cache-control\" content=\"no-cache\">");
		buffer.append("		<meta http-equiv=\"expires\" content=\"0\">");
		buffer.append("		<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">");
		buffer.append("		<meta http-equiv=\"description\" content=\"This is my page\">");
		buffer.append("	</head>");

		buffer.append("	<body>");
		buffer.append("		<form action='" + RequestUtil.requestUrl + "' method='post'>");
		for (Map.Entry<String, String> entry : paramMap.entrySet()) {
			buffer.append(entry.getKey() + "：			<input type='text' name='" + entry.getKey() + "' value='" + entry.getValue() + "' style='width: 800px;'/><br />");
		}
		buffer.append("			<input type='button' value='提交' onclick='checkForm();'/>");
		buffer.append("		</form>");
		buffer.append("	</body>");
		buffer.append("	<script type='text/javascript'>");
		buffer.append("		function checkForm() {document.forms[0].submit();}");
		buffer.append("	</script>");
		buffer.append("</html>");
		
		System.out.println(buffer);*/
	}
}

package com.yjf.api.demo;

import java.util.HashMap;
import java.util.Map;

import com.yjf.api.util.RequestUtil;

/**
 * 保存提现数据
 */
public class yzzSaveWithdrawData {

	/**
	 * 入口点
	 * @param args
	 */
	public static void main(String[] args) {
		new yzzSaveWithdrawData().execute();
	}

	public void execute() {
		Map<String, String> dataMap = new HashMap<String, String>();

		dataMap.put("20150408520029003979","20150404010004762372");
		dataMap.put("20150430520029310477","20150430010005163844");
		dataMap.put("20150429520029290762","20150402010004747184");
		dataMap.put("20150407520028994706","20150403010004759232");
		dataMap.put("20150407520028998682","20150403010004759232");
		dataMap.put("20150407520028995635","20150403010004759232");
		dataMap.put("20150408520029003458","20150403010004759232");
		dataMap.put("20150413520029041072","20150407010004801098");
		dataMap.put("20150429520029284519","20150428010005133023");
		dataMap.put("20150424520029202366","20150423010005058040");
		dataMap.put("20150410520029018990","20150408010004818499");
		dataMap.put("20150407520029001342","20150403010004760506");
		dataMap.put("20150421520029144438","20150417010004964289");
		dataMap.put("20150416520029076219","20150403010004761104");
		dataMap.put("20150421520029158340","20150407010004796538");
		dataMap.put("20150415520029057163","20150413010004897494");
		dataMap.put("20150423520029190864","20150407010004796621");
		dataMap.put("20150421520029144590","20150409010004832470");
		dataMap.put("20150407520028995623","20150407010004788212");
		dataMap.put("20150430520029310917","20150430010005159289");
		dataMap.put("20150423520029176417","20150422010005042856");
		dataMap.put("20150417520029088953","20150414010004908888");
		dataMap.put("20150407520028998935","20150403010004748426");
		dataMap.put("20150415520029055333","20150407010004798992");
		dataMap.put("20150408520029007911","20150401010004730422");
		dataMap.put("20150402520028973987","20150401010004730422");
		dataMap.put("20150430520029310169","20150429010005153096");


		//获取基本参数
		RequestUtil util = new RequestUtil();

		for (Map.Entry<String, String> entry : dataMap.entrySet()) {

			Map<String, String> paramMap = util.instanceMap();

			//添加请求参数
			paramMap.put(RequestUtil.SERVICENAME, this.getClass().getSimpleName().replace("_", "."));
			//paramMap.put("payOrderNo", "1412171558710036");

			paramMap.put("payNo", entry.getKey());

			paramMap.put("userId", entry.getValue());
			paramMap.put("payMode", "U");
			paramMap.put("delay", "0");

			//开始请求
			util.sendHttpRequest(paramMap);
			
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				
			}
		}
	}
}

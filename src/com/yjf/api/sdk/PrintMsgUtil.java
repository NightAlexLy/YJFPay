package com.yjf.api.sdk;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * 打印类
 */
public class PrintMsgUtil {
	
	private static Logger logger = Logger.getLogger(PrintMsgUtil.class);
	
	/**
	 * 打印Map中所有参数
	 * 输出格式: filed1=value1&field2=value2&field3=value3
	 * 
	 * @param paramMap  输出的参数集合
	 * @param console是否输出至Console[控制台]
	 */
	public static void printMap(Map<String, String> paramMap, boolean console) {
		if (paramMap == null) {
			print("paramMap is null!", console);
		} else {
			print(ConvertUtil.toString(paramMap, "&"), console);
		}
	}
	
	
	/**
	 * 格式化输出request中所有参数[含换行]
	 * 输出格式：
	 * field1==value1
	 * field2==value2
	 * field3==value3
	 * 
	 * @param paramMap 输出的参数集合
	 * @param console是否输出至Console[控制台]
	 */
	public static void printFormatMap(Map<String, String> paramMap, boolean console) {
		if (paramMap == null) {
			print("paramMap is null!", console);
		} else {
			print(ConvertUtil.toString(paramMap, "\n"), console);
		}
	}
	
	/**
	 * 打印request中所有参数
	 * 输出格式: filed1=value1&field2=value2&field3=value3
	 * 
	 * @param request 输出的请求
	 * @param console是否输出至Console[控制台]
	 */
	public static void printRequest(HttpServletRequest request, boolean console) {
		if (request == null) {
			print("request is null!", console);
		} else {
			print(ConvertUtil.toString(request, "&"), console);
		}
	}

	/**
	 * 格式化输出request中所有参数[含换行]
	 * 输出格式：
	 * field1==value1
	 * field2==value2
	 * field3==value3
	 * 
	 * @param request 输出的请求
	 * @param console是否输出至Console[控制台]
	 */
	public static void printFormatRequest(HttpServletRequest request, boolean console) {
		if (request == null) {
			print("request is null!", console);
		} else {
			print(ConvertUtil.toString(request, "\n"), console);
		}
	}
	
	/**
	 * 打印字符串
	 * @param msg
	 */
	private static void print(String msg, boolean console) {
		if (! console) {
			logger.info(msg);
		} else {
			System.out.println(msg);
		}
	}
}

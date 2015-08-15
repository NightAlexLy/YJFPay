package com.yjf.api.sdk;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

/**
 * 转换帮助类
 */
public class ConvertUtil {

	/**
	 * 将 Map<String, String[]> -> Map<String, String>
	 * 
	 * @param paramMap
	 * @return 转换完成的集合
	 */
	public static Map<String, String> toMap(Map<String, String[]> paramMap){
		Map<String, String> returnMap = new HashMap<String, String>();
		if (paramMap != null) {
			for (Map.Entry<String, String[]> entry : paramMap.entrySet()) {
				returnMap.put(entry.getKey(), entry.getValue()[0]);
			}
		}
		return returnMap;
	}
	
	/**
	 * 将HttpServletRequest中的所有参数按指定格式拼接
	 * 
	 * @param request 请求对象
	 * @param split   分隔字符
	 * @return        拼接完成的字符串
	 */
	public static String toString(HttpServletRequest request, String split) {
		StringBuilder buffer = new StringBuilder();
		Map<String, String[]> paramMap = request.getParameterMap();
		if (paramMap != null) {
			for (Map.Entry<String, String[]> entry : paramMap.entrySet()) {
				String[] value = entry.getValue();
				String sv = StringUtils.defaultIfEmpty((value != null && value.length > 0) ? value[0] : null, "");
				buffer.append(entry.getKey()).append("=").append(sv).append(split);
			}
		}
		return buffer.toString();
	}
	
	/**
	 * 将Map<String, String>中的所有参数按指定格式拼接
	 * 
	 * @param paramMap  数据集合
	 * @param split     分隔字符
	 * @return		          拼接完成的字符串
	 */
	public static String toString(Map<String, String> paramMap, String split) {
		StringBuilder buffer = new StringBuilder();
		if (paramMap != null) {
			for (Map.Entry<String, String> entry : paramMap.entrySet()) {
				buffer.append(entry.getKey()).append("=").append(entry.getValue()).append(split);
			}
		}
		return buffer.toString();
	}
	
	
	/**
	 * 将Map<String, Object> -> Map<String, String>
	 * 
	 * @param paramMap 数据集合
	 * @return
	 */
	public static Map<String, String> toMapString(Map<String, Object> paramMap) {
		Map<String, String> responseMap = null;
		if (paramMap != null) {
			responseMap = new HashMap<String, String>();
			for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
				responseMap.put(entry.getKey(), String.valueOf(entry.getValue()));
			}
			paramMap.clear();
		}
		return responseMap;
	}
}

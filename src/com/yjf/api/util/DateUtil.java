package com.yjf.api.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期帮助类 [解决SimpleDateFormat的线程安全问题]
 */
public class DateUtil {

	/** 存放不同的日期模板格式的SimpleDateFormat的Map */
	private static Map<String, ThreadLocal<SimpleDateFormat>> map = new HashMap<String, ThreadLocal<SimpleDateFormat>>();
	
	/**
	 * 返回一个ThreadLocal的simpleDateFormat,每个线程只会new一次simpleDateFormat
	 * @param pattern
	 * @return
	 */
	private static synchronized SimpleDateFormat getFormat(final String pattern) {
		 ThreadLocal<SimpleDateFormat> tl = map.get(pattern);
		 if (tl == null) {
			 tl = new ThreadLocal<SimpleDateFormat>(){
				 @Override
                 protected SimpleDateFormat initialValue() {
                     return new SimpleDateFormat(pattern);
                 }
			 };
		 }
		return tl.get();
	}

	
	/**
	 * java.util.Date -> String
	 * @param date
	 * @param pattern format格式
	 * @return
	 */
	public static String format(Date date, String pattern) {
		return getFormat(pattern).format(date);
	}

	/**
	 * java.util.Date -> String
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * String -> java.util.Date
	 * @param date
	 * @param pattern  format格式
	 * @return 
	 * @throws ParseException
	 */
	public static Date parse(String date, String pattern) throws ParseException {
		return getFormat(pattern).parse(date);
	}

	/**
	 * String -> java.util.Date
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parse(String date) throws ParseException {
		return parse(date, "yyyy-MM-dd HH:mm:ss");
	}
}

package com.yjf.api.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.util.RequestUtil;

/**
 * Servlet implementation class UserDeductServlet
 * 
 * 用户代扣充值servlet
 */
public class UserDeductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserDeductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 代扣充值
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestUtil util = new RequestUtil();
		
		Map<String, String> paramMap = util.instanceMap();
		
		//添加请求参数
		paramMap.put(RequestUtil.SERVICENAME, "yzzNewDeductPtk");
		paramMap.put("userId", request.getParameter("userId"));
		paramMap.put("bankAccountNo", request.getParameter("bankAccountNo"));
		paramMap.put("bankCode", request.getParameter("bankCode"));
		paramMap.put("money", request.getParameter("money"));
		paramMap.put("payMode", request.getParameter("payMode"));
		paramMap.put("bankProvName", "北京市");
		paramMap.put("bankCityName", "北京市");
		paramMap.put("paytk", request.getParameter("tokenValue"));
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		int port = request.getServerPort();
		
		String notifyUrl = "http://" + ip + ":" + port + request.getContextPath() + "/userDeductNotice";
		
		paramMap.put(RequestUtil.NOTIFYNAME, notifyUrl);
		
		Map<String, String> resultMap = util.sendHttpRequest(paramMap);
		
		String resultCode=  resultMap.get("resultCode");
		
		String msg = "";
		if ("EXECUTE_SUCCESS".equals(resultCode)) {
			//执行上账操作
			msg = "恭喜您呀恭喜您、充值已经成功啦!";
		} else if ("BIZ_PROCESSING".equals(resultCode)){
			//正在充值中，等待异步通知结果
			msg = "充值正在处理中，请等待结果！";
		} else {
			msg = "对不起，充值失败,详细信息(" + resultMap.get("resultMessage") + ")";
		}
		
		request.setAttribute("deductMessage", msg);
		request.getRequestDispatcher("yzzNewDeductResult.jsp").forward(request, response);
	}
}

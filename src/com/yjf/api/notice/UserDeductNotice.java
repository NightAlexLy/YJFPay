package com.yjf.api.notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.sdk.ConvertUtil;
import com.yjf.api.sdk.PrintMsgUtil;

/**
 * Servlet implementation class UserDeductServlet
 * 
 * 用户代扣充值Notice
 */
public class UserDeductNotice extends HttpServlet {

	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserDeductNotice() {
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
	 * 代扣充值Notice
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("接收到快捷充值异常通知参数");    //打印所有参数
		PrintMsgUtil.printFormatRequest(request, true);
		
		Map<String, String> resultMap = ConvertUtil.toMap(request.getParameterMap());
		
		String resultCode = resultMap.get("resultCode");
		if ("EXECUTE_SUCCESS".equals(resultCode)) {
			//充值成功执行上账
		} else {
			//充值失败
		}
		
		PrintWriter out = response.getWriter();
		out.write("success");
		out.flush();
		out.close();
	}
}

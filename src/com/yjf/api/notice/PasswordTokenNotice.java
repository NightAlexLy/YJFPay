package com.yjf.api.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.sdk.PrintMsgUtil;

/**
 * 密码控件 notice
 */
public class PasswordTokenNotice extends HttpServlet {

	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PasswordTokenNotice() {
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
	 * 密码控件
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintMsgUtil.printFormatRequest(request, true);
		request.setAttribute("tokenValue", request.getParameter("paytk"));
		request.getRequestDispatcher("tokenNotice.jsp").forward(request, response);
	}
}

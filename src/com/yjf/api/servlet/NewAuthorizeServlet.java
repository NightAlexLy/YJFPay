package com.yjf.api.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.sdk.PrintMsgUtil;
import com.yjf.api.util.BornApiServiceEnums;
import com.yjf.api.util.RequestUtil;

/**
 * Servlet implementation class NewAuthorizeServlet
 * 
 * 跳转实名认证接口servlet
 */
public class NewAuthorizeServlet extends HttpServlet {
	
	private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }


    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAuthorizeServlet() {
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
	 * 跳转实名认证
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		
		RequestUtil util = new RequestUtil();
		
		/**拼接参数**/
		Map<String, String> paramMap = util.instanceMap();
		
		paramMap.put(RequestUtil.SERVICENAME, BornApiServiceEnums.NEW_AUTHORIZE.code());
		
		paramMap.put("userId", userId);
		
		paramMap.put(RequestUtil.RETURNNAME, "https://www.yiji.com/");
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		int port = request.getServerPort();
		
		String notifyUrl = "http://" + ip + ":" + port + request.getContextPath() + "/testResponseNotice";
		
		paramMap.put(RequestUtil.NOTIFYNAME, notifyUrl);
		
		/**放入基本参数并签名**/
		
		util.putSign(paramMap);
		
		PrintMsgUtil.printFormatMap(paramMap, true);
		
		request.setAttribute("paramMap", paramMap);
		request.setAttribute("requestUrl", RequestUtil.requestUrl);
		request.getRequestDispatcher("commitForm.jsp").forward(request, response);
	}
}

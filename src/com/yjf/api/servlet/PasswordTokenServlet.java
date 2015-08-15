package com.yjf.api.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.sdk.PrintMsgUtil;
import com.yjf.api.util.RequestUtil;

/**
 * 密码控件
 */
public class PasswordTokenServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordTokenServlet() {
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
		
		/**session中获取**/
		String userId = "20141215010000097062";
		
		RequestUtil util = new RequestUtil();
		
		/**拼接参数**/
		Map<String, String> paramMap = util.instanceMap();
		
		paramMap.put(RequestUtil.SERVICENAME, "create.paytk");
		
		paramMap.put("userId", userId);
		paramMap.put("isPhone", "1");

		String ip = InetAddress.getLocalHost().getHostAddress();
		int port = request.getServerPort();
		
		String returnUrl = "http://" + ip + ":" + port + request.getContextPath() + "/passwordTokenNotice";
		paramMap.put(RequestUtil.RETURNNAME, returnUrl);
		
		/**放入基本参数并签名**/
		
		util.putSign(paramMap);
		
		PrintMsgUtil.printFormatMap(paramMap, true);
		
		request.setAttribute("paramMap", paramMap);
		request.setAttribute("requestUrl", RequestUtil.requestUrl);
		request.getRequestDispatcher("commitForm.jsp").forward(request, response);
	}
}

package com.yjf.api.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjf.api.util.BornApiServiceEnums;
import com.yjf.api.util.RequestUtil;

/**
 * Servlet implementation class UserSpecialRegisterServlet
 * 综合接口用户注册servlet
 */
public class UserSpecialRegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	private final String failPage = "yzzRegisterFail.jsp";
	private final String successPage = "yzzRegisterSuccess.jsp";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSpecialRegisterServlet() {
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
	 * 处理用户注册
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestUtil util = new RequestUtil();
		
		/**拼接参数**/
		Map<String, String> paramMap = util.instanceMap();
		paramMap.put(RequestUtil.SERVICENAME, BornApiServiceEnums.YZZUSERSPECIALREGISTER.code());
		paramMap.put("userName", request.getParameter("userName"));
		paramMap.put("userType", request.getParameter("userType"));
		
		String realName = new String(request.getParameter("realName").getBytes("ISO-8859-1"), "UTF-8");
		paramMap.put("realName", realName);
		
		paramMap.put("email", request.getParameter("email"));
		paramMap.put("mobile", request.getParameter("mobile"));
		paramMap.put("certValidTime", request.getParameter("certValidTime"));
		paramMap.put("certNo", request.getParameter("certNo"));
		paramMap.put("isMainland", request.getParameter("isMainland"));
		
		
		/**请求接口**/
		
		Map<String, String> resultMap = util.sendHttpRequest(paramMap);
		
		String resultCode = resultMap.get("resultCode");
		String userId = resultMap.get("userId");
		
		/**对结果进行相应处理**/
		String msg = "";
		if ("EXECUTE_SUCCESS".equals(resultCode) || "REGISTER_SUCCESS_UNKOW_REAL".equals(resultCode)) {
			//1、保存数据至本地、以及其它操作
			//.........
			
			
			//2、跳转至成功页
			request.setAttribute("modifyPwdAddress", resultMap.get("modifyPwdAddress"));
			request.setAttribute("successMessage", resultMap.get("resultMessage"));
			request.setAttribute("userId", userId);
			
			request.getRequestDispatcher(successPage).forward(request, response);
		} else if (userId != null && !"".equals(userId)) {
			/**注册显示失败但又返回了userId，概率相当低事件**/
			msg = "您的第三方账号已经开通成功，但部分步骤出现异常，请联系平台处理！<br />(" 
			+ resultMap.get("resultMessage") + " [本次请求订单号：" + paramMap.get("orderNo") + "])";
			request.setAttribute("failureMessage", msg);
			
			request.getRequestDispatcher(failPage).forward(request, response);
		}else {
			msg = resultMap.get("resultMessage") + " [本次请求订单号：" + paramMap.get("orderNo") + "]";
			request.setAttribute("failureMessage", msg);
			
			request.getRequestDispatcher(failPage).forward(request, response);
		}
	}

	
}

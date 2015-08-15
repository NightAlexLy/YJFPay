<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>第三方账号注册成功</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>

	<body>
		<font color='red' size="+2">
			<%=request.getAttribute("successMessage") %> <br /><br />
		</font>
		
		
		
		为了您的账户安全，您可继续完成以下操作[<font color='red'>非必要</font>]：<br /><br />
		1、<A href="<%=request.getAttribute("modifyPwdAddress") %>" target="_bank">点此修改</A>&nbsp;初始登录密码与支付密码。 <br /><br />
		2、<A href="<%=path%>/newAuthorizeServlet?userId=<%=request.getAttribute("userId") %>" target="_bank">点此增强</A>&nbsp;用户实名等级，增强后，方可进行提现。[如现在不操作，等有空时再操作也可以，但审核需要1个一工作日，建议提前增强] <br />
	</body>
</html>

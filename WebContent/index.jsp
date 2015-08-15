<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>易极付测试DEMO</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>

	<body>
		<font color="red" size="+3">该程序由易极付提供,便于商户顺利测试我方接口!</font>
		<br />
		<br />
		<br />
		<A href="<%=path%>/yzzUserSpecialRegister.jsp">综合接口注册 演示&gt;&gt;</A>
		<br />
		<br />
		<br />
		<A href="<%=path%>/yzzNewDeduct.jsp">密码控件使用案例&gt;&gt;</A>
	</body>
</html>

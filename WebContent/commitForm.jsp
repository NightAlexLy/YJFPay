<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>请求提交中</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>

	<body>
		<form action="<%=request.getAttribute("requestUrl")%>" method="post">
			<%
				Map<String, String> paramMap = (Map<String, String>)request.getAttribute("paramMap");
				for (Map.Entry<String, String> entry : paramMap.entrySet()) {
					out.println("<input type='hidden' name='" + entry.getKey() + "' value='" + entry.getValue() + "'/>");
				}
			%>
		</form>
	</body>
	<script type="text/javascript">
		document.forms[0].submit();
	</script>
</html>

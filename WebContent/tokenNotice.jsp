<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>token回调页</title>
	</head>
	<script type="text/javascript">
		try {
			var tokenValue = '<%=request.getAttribute("tokenValue")%>';
			var parentObject = window.parent.document;
			parentObject.getElementById("tokenValue").value = tokenValue;
			parentObject.forms[0].submit();
		} catch (e) {
			alert("测试过程中，不能用localhost访问，应该是http://外网网络ip:8080/....");
		}
	</script>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>四合一用户接口注册</title>
		<style type="text/css">
			table, tr, td {border: 1px solid black;border-collapse: collapse;}
			td {height: 40px;}
			table thead tr {background-color: gray;text-align: center;}
			table {width: 800px;}
			table input {width: 250px;height: 27px;}
			.rightStyle{text-align: right;}
			.commonButton {margin-top: 20px;width: 100px;height: 27px;}
			select {width: 253px; height:30px;}
		</style>
		<script type="text/javascript">
			function checkForm() {
				var mobile = document.getElementById("mobile").value;
				var email = document.getElementById("email").value;
				if (mobile == "" || email == "") {
					alert("手机、邮箱不能为空!");
				} else {
					document.forms[0].submit();
				}
			}
		</script>
	</head>
	<body>
		<form action="<%=path%>/userSpecialRegisterServlet" method="post">
			<table>
				<thead>
					<tr>
						<td colspan="2"> 
							<b>易极付账号注册</b>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td width="40%" class="rightStyle">用户名：</td>
						<td width="60%"><input name="userName" value="demo@testUser1"/></td>
					</tr>
					<tr>
						<td class="rightStyle">用户类型：</td>
						<td>
							<select name="userType">
								<option value="P">个人</option>
								<option value="B">企业</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="rightStyle">真实姓名：</td>
						<td><input name="realName" value="张三"/></td>
					</tr>
					<tr>
						<td class="rightStyle">证件号码：</td>
						<td><input name="certNo" value="431028198912054014"/></td>
					</tr>
					<tr>
						<td class="rightStyle">电子邮箱：</td>
						<td>
							<input name="email"  id="email" value=""/>
							<font size="-1" color="red">*不要乱填邮箱</font>
						</td>
					</tr>
					<tr>
						<td class="rightStyle">手机号码：</td>
						<td>
							<input name="mobile" id="mobile" value=""/>
							<font size='-1' color='red'>*不要乱填手机，以免短信投诉</font>
						</td>
					</tr>
					<tr>
						<td class="rightStyle">证件有效期：</td>
						<td><input name="certValidTime" value="2020-10-10"/></td>
					</tr>
					<tr>
						<td class="rightStyle">是否大陆用户：</td>
						<td>
							<select name="isMainland">
								<option value="Y">是</option>
								<option value="N">否</option>
							</select>
						</td>
					</tr>
				</tbody>
			</table>
			<DIV style="width: 800px; text-align: center;">
				<input class="commonButton" type="button" value="马上开通" onclick="checkForm();"/>
			</DIV>
		</form>
	</body>
</html>
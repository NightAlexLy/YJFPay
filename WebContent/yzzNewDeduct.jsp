<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>代扣充值[含token] DEMO 演示</title>
		<style type="text/css">
			table, tr, td {border: 1px solid black;border-collapse: collapse;}
			td {height: 40px;}
			table thead tr {background-color: gray;text-align: center;}
			table {width: 800px;}
			table input {width: 250px;height: 27px;}
			.rightStyle{text-align: right;}
			.commonButton {margin-top: 20px;width: 100px;height: 27px;}
			iframe{border:0px solid red;}
		</style>
	</head>
	<body>
		<form action="<%=path%>/userDeductServlet" method="post">
			<!-- token值 -->
			<input type="hidden" name="tokenValue" id="tokenValue"/>
			
			<table>
				<thead>
					<tr>
						<td colspan="2"> 
							<b>易极付代扣充值[含token]</b>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td width="40%" class="rightStyle">用户ID：</td>
						<td width="60%"><input name="userId"  value="20141215010000097062" readonly="readonly"/></td>
					</tr>
					<tr>
						<td class="rightStyle">充值金额：</td>
						<td><input name="money" value="500"/></td>
					</tr>
					<tr>
						<td class="rightStyle">银行简称：</td>
						<td><input name="bankCode" value="ICBC"/></td>
					</tr>
					<tr>
						<td class="rightStyle">银行卡号：</td>
						<td>
							<input name="bankAccountNo"  id="bankAccountNo" value="6222023602097746151"/>
						</td>
					</tr>
					<tr>
						<td class="rightStyle">手续方支付：</td>
						<td><input name="payMode" value="P"/></td>
					</tr>
				</tbody>
			</table>
			<br />
			<hr style="border: 1px solid black;"/>
			支付密码：aaa_111111
			<div style="width: 800px; text-align: center;">
				<iframe name="yjfPasswordIframe" height="100" width="450" scrolling="no" src="<%=path%>/passwordTokenServlet">
				</iframe>
			</div>
		</form>
	</body>
</html>
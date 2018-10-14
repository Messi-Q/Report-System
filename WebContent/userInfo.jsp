<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本信息</title>
<link rel="stylesheet" href="css/userInfo.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">基础信息</div>
		<div class="body">
			<form action="">
				<table align="center" cellspacing="0">
					<tr>
						<td align="center" colspan="3">
							<h2>基本信息</h2>
						</td>
					</tr>
					<tr>
						<td><font>用户名：</font></td>
						<td><label id="UserName"></label></td>
						<td>您的用户名</td>
					</tr>
					<tr>
						<td><font>学号：</font></td>
						<td><label id="CardId"></label></td>
						<td></td>
					</tr>
					<tr>
						<td><font>性别：</font></td>
						<td><label id="Sex"></label></td>
						<td></td>
					</tr>
					<tr>
						<td><font>年龄：</font></td>
						<td><label id="Age"></label></td>
						<td></td>
					</tr>
					<tr>
						<td><font>手机号码：</font></td>
						<td><label id="Tel"></label></td>
						<td></td>
					</tr>
					<tr>
						<td><font>电子邮箱：</font></td>
						<td><label id="Email"></label></td>
						<td></td>
					</tr>

					<tr>
						<td align="center" colspan="3"><input type="submit"
							value="编辑" onClick="return checkAll()" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
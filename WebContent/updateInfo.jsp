<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑信息</title>
<link rel="stylesheet" href="css/userInfo.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">基础信息</div>
		<div class="body">
			<table align="center" cellspacing="0">
				<tr>
					<td align="center" colspan="3">
						<h2>
							请编辑您的信息
						</h2>
					</td>
				</tr>
				<tr>
					<td><font>用户名：</font></td>
					<td><label id="UserName" ></label></td>
					<td><font>*</font>用来登录你的用户名</td>
				</tr>
		        <tr>
					<td><font>学号：</font></td>
					<td><label id="CardId" ></label></td>
					<td><font>*</font>请填写你的真实信息</td>
				</tr>
				<tr>
					<td><font>性别：</font></td>
					<td><input type="radio" value="男" checked="checked" name="Sex" />男
						<input type="radio" value="女" name="Sex" />女</td>
					<td><font>*</font>请填写你的真实信息</td>
				</tr>
				<tr>
					<td><font>年龄：</font></td>
					<td><input type="text" name="Age" /></td>
					<td><font>*</font>请填写你的真实年龄</td>
				</tr>
				<tr>
					<td><font>手机号码：</font></td>
					<td><input type="text" name="UserTel" /></td>
					<td><font>*</font>请填写你的真实信息(须填写正确格式)</td>
				</tr>
				<tr>
					<td><font>电子邮箱：</font></td>
					<td><input type="text" name="Email" id="Email" /></td>
					<td><font>*</font>请填写你的邮件地址，以便我们为你提供有效的服务</td>
				</tr>
				
				<tr>
					<td align="center" colspan="3">
					    <input type="submit" value="提交" onClick="return checkAll()" />
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
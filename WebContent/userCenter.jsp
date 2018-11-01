<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户中心</title>
<link rel="stylesheet" href="css/userCenter.css">
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">用户中心</div>
		<div class="body">
			<form action="UpdateAdminInfo" method="post">
				<table border="1px" cellspacing="0px">
					<tr>
						<td>更改用户信息</td>
					</tr>
					<tr>
						<td>用户名：<input type="text" name="adminName" value="" /></td>
					</tr>
					<tr>
						<td>原密码：<input type="password" name="pwd" /></td>
					</tr>
					<tr>
						<td>新密码：<input type="password" name="newPwd" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="修改" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
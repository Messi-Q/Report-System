<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<table align="center" cellspacing="0">
				<tr>
					<td align="center" colspan="3">
						<h2>基本信息</h2>
					</td>
				</tr>
				<c:forEach items="${teacherInfo }" var="teacherInfo">
					<tr>
						<td><font>用户名：</font></td>
						<td><label id="stuName">${teacherInfo.teName }</label></td>
						<td>*请填写信息</td>
					</tr>
					<tr>
						<td><font>卡号：</font></td>
						<td><label id="CardId">${teacherInfo.card }</label></td>
						<td>*请填写信息</td>
					</tr>
					<tr>
						<td><font>性别：</font></td>
						<td><label id="Sex">${teacherInfo.sex }</label></td>
						<td>*请填写信息</td>
					</tr>
					<tr>
						<td><font>年龄：</font></td>
						<td><label id="Age">${teacherInfo.age }</label></td>
						<td>*请填写信息</td>
					</tr>
					<tr>
						<td><font>手机号码：</font></td>
						<td><label id="Tel">${teacherInfo.teTel }</label></td>
						<td>*填写手机号，以便联系</td>
					</tr>
					<tr>
						<td><font>电子邮箱：</font></td>
						<td><label id="Email">${teacherInfo.email }</label></td>
						<td>*填写邮件，以便联系</td>
					</tr>

					<tr>
						<td align="center" colspan="3"><a
							href="BasicInfoServlet?opt=finds&cardId=${teacherInfo.card }">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
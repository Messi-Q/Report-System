<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div class="list">编辑信息</div>
		<div class="body">
			<form action="BasicInfoServlet?opt=updateTeInfo" method="post">
				<table align="center" cellspacing="0">
					<tr>
						<td align="center" colspan="3">
							<h2>请编辑您的信息</h2>
						</td>
					</tr>
					<c:forEach items="${teacherInfo }" var="teacherInfo">
						<tr>
							<td><font>用户名：</font></td>
							<td><input type="text" value="${teacherInfo.teName }"
								name="TeName" readonly="readonly"/></td>
							<td><font>*</font>(不可修改)</td>
						</tr>
						<tr>
							<td><font>学号：</font></td>
							<td><input type="text" value="${teacherInfo.card }"
								name="CardId" readonly="readonly"/></td>
							<td><font>*</font>(不可修改)</td>
						</tr>
						<tr>
							<td><font>性别：</font></td>
							<td><input type="radio" value="男" checked="checked"
								name="Sex" />男 <input type="radio" value="女" name="Sex" />女</td>
							<td><font>*</font>请填写你的真实信息</td>
						</tr>
						<tr>
							<td><font>年龄：</font></td>
							<td><input type="text" value="${teacherInfo.age }" name="Age" /></td>
							<td><font>*</font>请填写你的真实年龄</td>
						</tr>
						<tr>
							<td><font>手机号码：</font></td>
							<td><input type="text" value="${teacherInfo.teTel }"
								name="TeTel" /></td>
							<td><font>*</font>请填写你的真实信息(须填写正确格式)</td>
						</tr>
						<tr>
							<td><font>电子邮箱：</font></td>
							<td><input type="text" value="${teacherInfo.email }"
								name="Email" /></td>
							<td><font>*</font>请填写你的邮件地址，以便我们为你提供有效的服务</td>
						</tr>

						<tr>
							<td align="center" colspan="3"><input type="submit"
								value="提交"/></td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
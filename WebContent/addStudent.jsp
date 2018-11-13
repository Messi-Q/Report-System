<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
<link rel="stylesheet" href="css/addStudent.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">录入学生信息</div>
		<div class="body">
			<form action="AddStudentServlet" method="get">
				输入学生学号：<input type="text" name="stuCardId" /> <br /> 
				输入学生姓名：<input type="text" name="stuName" /> <br /> 
				<input type="button" value="提交" /> 
				<input type="reset" value="重置" />
			</form>
		</div>
	</div>
</body>
</html>
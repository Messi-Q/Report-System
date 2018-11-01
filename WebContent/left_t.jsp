<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师登录</title>
<link rel="stylesheet" href="css/left.css" />
</head>
<body>
	<div class="main">
		<div class="menu">
			<div class="menu_head">基础信息</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> 
				<a href="BasicInfoServlet?opt=findTeacher&cardId=${cardId }" target="right">基础信息列表</a>
				<a href="BasicInfoServlet?opt=findsTeacher&cardId=${cardId }" target="right">编辑信息</a> 
			</div>
		</div>
		
		<div class="menu">
			<div class="menu_head">学生周报管理</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> 
				<a href="addStudent.jsp" target="right">添加学生到实验室</a> 
				<a href="setDeadline.jsp" target="right">设置截止日期</a>
				<a href="ReportOutServlet?opt=reportOut" target="right">周报导出</a>
				<a href="sellList" target="right">按日期查询</a>
				<a href="queryOrder" target="right">按标题查询</a> 
			</div>
		</div>
		
		<div class="menu">
			<div class="menu_head">用户中心</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> 
				<a href="userCenter.jsp?" target="right">找回密码</a>
			</div>
		</div>

	</div>
	<div class="menu">
		<div class="menu_head">
			<a href="stuLogin.jsp" target="_parent">注销退出</a>
		</div>
	</div>

</body>
</html>
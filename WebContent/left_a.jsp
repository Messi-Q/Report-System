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
			<div class="menu_head">人员管理</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> <a
					href="BasicInfoServlet?opt=findTeacher&cardId=${cardId }"
					target="right">实验室管理</a> <a
					href="BasicInfoServlet?opt=findsTeacher&cardId=${cardId }"
					target="right">教师信息管理</a> <a
					href="BasicInfoServlet?opt=findsTeacher&cardId=${cardId }"
					target="right">学生信息管理</a>
			</div>
		</div>

		<div class="menu">
			<div class="menu_head">学生周报管理</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" />  
				<a href="setDeadline.jsp" target="right">设置周报截止日期</a> 
				<a href="ReportServlet?opt=findAllReport" target="right">学生周报信息列表</a>
				<a href="searchAllReport.jsp" target="right">学生周报查询和导出</a> 
				<a href="ListFileServlet" target="right">资料附件下载</a>
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
			<a href="adminLogin.jsp" target="_parent">注销退出</a>
		</div>
	</div>

</body>
</html>
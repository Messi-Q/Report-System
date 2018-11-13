<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
<link rel="stylesheet" href="css/left.css" />
</head>
<body>
	<div class="main">
		<div class="menu">
			<div class="menu_head">基础信息</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> 
				<a href="BasicInfoServlet?opt=find&cardId=${cardId }" target="right">基础信息列表</a>
				<a href="BasicInfoServlet?opt=finds&cardId=${cardId }" target="right">编辑信息</a> 
			</div>
		</div>
		
		<div class="menu">
			<div class="menu_head">周报管理</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> 
				<a href="ReportServlet?opt=upload&cardId=${cardId }" target="right">周报上传</a> 
				<a href="ReportServlet?opt=findAll&cardId=${cardId }&name=${name }" target="right">周报列表</a>
				<a href="searchReport.jsp" target="right">周报查询</a> 
				<a href="ListFileServlet" target="right">文件下载</a> 
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
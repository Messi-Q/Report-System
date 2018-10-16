<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
				<a href="ReportServlet?opt=findAll&cardId=${cardId }" target="right">周报信息列表</a>
				<a href="ReportOutServlet?opt=reportOut" target="right">周报导出</a>
			</div>
		</div>
		<div class="menu">
			<div class="menu_head">销售订单管理</div>
			<div class="menu_body">
				<img src="img/menu_topline.gif" /> <a href="sellList" target="right">销售订单信息列表</a>
				<a href="queryOrder" target="right">销售订单查询</a> <a href="totalSell"
					target="right">本日销售统计</a>
			</div>
		</div>
		<div class="menu">
			<div class="menu_head">
				<a href="userManage.jsp?adminName=<%=request.getParameter("adminName")%>&adminId=<%=request.getParameter("adminId")%>"
					target="right">用户中心</a>
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
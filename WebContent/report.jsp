<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>周报</title>
<link rel="stylesheet" href="css/report1.css" />
</head>
<body>
<div class="report">
		<c:forEach items="${reportList }" var="reportList">
			<h2 align="center" style="font-family: '黑体';">${reportList.reportTitle }</h2>
			<h3 align="center" style="font-family: '黑体';">${reportList.reportTime }</h3>
			<p class="p1" align="center">&nbsp;&nbsp;&nbsp;&nbsp;${reportList.lastReportCont }</p>
			<h4 align="center"><a href="userCenter.jsp" class="a1">返回</a></h4>
		</c:forEach>
	</div>
</body>
</html>
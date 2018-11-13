<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生周报信息列表</title>
<link rel="stylesheet" href="css/report.css" />
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">周报列表</div>
		<div class="body">
			${tmp.message }
			<table border="1px" cellspacing="0px">
				<caption>周报信息列表</caption>
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>周报标题</th>
					<th>周报上传时间</th>
					<th>查看</th>
					<th>评语</th>
				</tr>

				<c:forEach items="${reportList }" var="reportList">
					<tr>
						<td>${reportList.cardId }</td>
						<td>${reportList.stuName }</td>
						<td>${reportList.reportTitle}</td>
						<td>${reportList.reportTime}</td>
						<td><a
							href="ReportServlet?opt=doSelectOne&reportId=${queryList.reportId }">查看</a>
						</td>
						<td><a href="">评语</a>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="11">第1页&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">[首页]</a><a
						href="#">[尾页]</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">[上一页]</a><a
						href="#">[下一页]</a></td>
				</tr>
			</table>

		</div>
	</div>
</body>
</html>
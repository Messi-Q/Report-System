<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>周报列表</title>
<link rel="stylesheet" href="css/report.css" />
<script type="text/javascript">
	function delcfm() {
		if (!confirm("确认要删除？")) {
			window.event.returnValue = false;
		}
	}
</script>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">周报列表</div>
		<div class="body">

			<table border="1px" cellspacing="0px">
				<caption>周报信息列表</caption>
				<tr>
					<th>学号</th>
					<th>周报标题</th>
					<th>周报上传时间</th>
					<th>查看</th>
					<th>修改</th>
					<th>删除</th>
				</tr>

				<c:forEach items="${reportList }" var="reportList">
					<tr>
						<td>${reportList.cardId }</td>
						<td>${reportList.reportTitle}</td>
						<td>${reportList.reportTime}</td>
						<td><a
							href="ReportServlet?opt=doSelectOne&reportId=${reportList.reportId }">查看</a>
						</td>
						<td><a
							href="ReportServlet?opt=toUpdate&reportId=${reportList.reportId }">修改</a>
						</td>
						<td><a
							href="ReportServlet?opt=delete&reportId=${reportList.reportId }&cardId=${reportList.cardId }"
							onClick="delcfm()">删除</a></td>
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
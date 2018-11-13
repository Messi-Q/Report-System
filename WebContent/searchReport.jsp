<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>周报列表</title>
<link rel="stylesheet" href="css/report.css" />
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">周报列表</div>
		<div class="body">
			<table border="1px" cellspacing="0px">
				<tr>
					<td class="c1">按标题查询</td>
					<td class="c2">
						<form action="ReportServlet?opt=queryMyReport" method="post">
							<input type="text" name="reportTitle" /> <input type="submit"
								value="查询" />
						</form>
					</td>
				</tr>
				
				<tr>
					<td class="c1">按上传日期查询</td>
					<td class="c2">
						<form action="ReportServlet?opt=queryMyReport" method="post">
							<input type="date" name="submitTime" /> <input type="submit"
								value="查询" />
						</form>
					</td>
				</tr>
			</table>

			<table border="1px" cellspacing="0px">
				<caption>周报信息列表</caption>
				<tr>
					<th>周报Id</th>
					<th>学号</th>
					<th>姓名</th>
					<th>周报标题</th>
					<th>周报上传时间</th>
					<th>查看</th>
				</tr>

				<c:forEach items="${queryList }" var="queryList">
					<tr>
						<td>${queryList.reportId }</td>
						<td>${queryList.cardId }</td>
						<td>${queryList.stuName }</td>
						<td>${queryList.reportTitle}</td>
						<td>${queryList.reportTime}</td>
						<td><a
							href="ReportServlet?opt=doSelectOne&reportId=${queryList.reportId }">查看</a>
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
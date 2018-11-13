<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改周报</title>
<link rel="stylesheet" href="css/addReport.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">修改周报</div>
		<div class="body">
			<form action="ReportServlet?opt=doUpdate " method="post">

				<table border="1" cellspacing="0" cellpadding="0">
					<c:forEach items="${reportList }" var="reportList">
					    <tr>
							<td class="td1">学 &nbsp;&nbsp;号：<input type="text" class="text"
								name="cardId" value="${reportList.cardId }" readonly="readonly" />
								&nbsp;<font color="red">不可更改</font></td>
						</tr>
						<tr>
							<td class="td1">周报编号：<input type="text" class="text"
								name="reportId" value="${reportList.reportId }" readonly="readonly" />
								&nbsp;<font color="red">不可更改</font></td>
						</tr>
						<tr>
							<td class="td1">周报标题：<input type="text" class="text"
								name="reportTitle" value="${reportList.reportTitle }" /></td>
						</tr>
						<tr>
							<td class="td1">上传时间：<input type="text" class="text"
								name="reportTime" value="${reportList.reportTime }" /></td>
						</tr>
						<tr>
							<td class="td2">上周任务:<textarea id="textarea1"
									name="lastReportCont">${reportList.lastReportCont }</textarea></td>
						</tr>
						<tr>
							<td class="td2">本周进度:<textarea id="textarea1"
									name="thisReportCont">${reportList.thisReportCont }</textarea></td>
						</tr>
						<tr>
							<td class="td2">下周计划:<textarea id="textarea1"
									name="nextReportCont">${reportList.nextReportCont }</textarea></td>
						</tr>
						<tr class="tr3">
							<td>
							    <div align="center">
								    <input type="submit" value="保存修改" />
								    <a href="reportList.jsp">返回</a>
								</div>
							</td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
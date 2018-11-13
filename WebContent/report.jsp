<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>周报</title>
<script src="https://cdn.bootcss.com/jquery/3.3.0/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.3.0/jquery.js"></script>
<link rel="stylesheet" href="css/report1.css" />
<script type="text/javascript">
	$(function() {
		$("#btn_word").on("click", function() {
			$("#form1").prop("action", "ExportServlet?type=word").submit();
		});

		$("#btn_pdf").on("click", function() {
			$("#form1").prop("action", "ExportServlet?type=pdf").submit();
		});
	});
</script>
</head>
<body>
	<div class="report">
		<form id="form1" action="ExportServlet" method="post">
			<c:forEach items="${reportList }" var="reportList">
				<h2 align="center" style="font-family: '黑体';">${reportList.reportTitle }</h2>
				<h3 align="center" style="font-family: '黑体';">${reportList.stuName }</h3>
				<h3 align="center" style="font-family: '黑体';">${reportList.reportTime }</h3>
				<p class="p1" align="center">&nbsp;&nbsp;&nbsp;&nbsp;${reportList.lastReportCont }</p>
				<p class="p2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;${reportList.thisReportCont }</p>
				<p class="p3" align="center">&nbsp;&nbsp;&nbsp;&nbsp;${reportList.nextReportCont }</p>
				<h4 align="center">
					<a href="reportList.jsp" class="a1">返回</a>
				</h4>

				<div align="center">
					<input type="hidden" name="reportId" value="${reportList.reportId }" /> 
					<input id="btn_word" type="button" value="导出word" /> 
					<input id="btn_pdf" type="button" value="导出pdf" />
				</div>
			</c:forEach>
		</form>
	</div>
</body>
</html>
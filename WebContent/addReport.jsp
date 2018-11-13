<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>周报上传</title>
<link rel="stylesheet" href="css/addReport.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">周报上传</div>
		<div class="body">
			<form action="ReportServlet?opt=add&cardId=${cardId }&name=${name }" method="post" enctype="multipart/form-data">
				<table border="1" cellspacing="0" cellpadding="0">
					<tr>
						<td class="td1">标题：<input type="text" class="text"
							name="reportTitle" /></td>
					</tr>

					<tr>
						<td><span class="span1">上周任务：</span> <textarea id="textarea1"
								name="lastReportCont" ></textarea></td>
					</tr>

					<tr>
						<td><span class="span1">本周进度：</span> <textarea
								id="textarea1" name="thisReportCont"></textarea></td>
					</tr>

					<tr>
						<td><span class="span1">下周计划：</span> <textarea id="textarea1"
								name="nextReportCont"></textarea></td>
					</tr>
					
					<tr>
						<td><input type="file" name="file" size="20" /></td>
					</tr>

					<tr>
						<td>
							<div align="center">
								<input type="submit" name="submit" value="上传" /> 
								<input type="reset" name="reset" value="重置" />
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
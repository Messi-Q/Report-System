<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设置周报截止日期</title>
<link rel="stylesheet" href="css/setDealine.css">
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="list">设置日期</div>
		<div class="body">
			<div class="time">
				<form action="SetTimeServlet" method="post">
					<label>设置截止时间：</label> <input type="date" id="date" name="date"
						class="date" /> <br /> <input type="submit" value="设置" />
				</form>
				<button>修改</button>
			</div>
		</div>
	</div>
</body>
</html>
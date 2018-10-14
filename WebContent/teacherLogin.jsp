<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师登录</title>
<script src="js/login.js"></script>
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="css/login.css" />
</head>
<body>
	<div class="main">
		<div class="top"></div>
		<div class="middle">
			<div class="left">
				<img src="img/logo1.png" id="img" /> 
				<span id="email"> 
					<img src="img/icon-mail2.gif" />&nbsp;客户服务邮箱：mess.qp711@gmail.com
				</span> 
				<span id="web"><img src="img/icon-phone.gif" />&nbsp;官方网站：https://messi-q.github.io/</span>
				<a href="#" id="info"><img src="img/icon-demo.gif" />&nbsp;使用说明</a>
				<a href="#" id="kefu"><img src="img/icon-login-seaver.gif" />&nbsp;在线客服</a>
			</div>
			<div class="center">
				<form action="AdminInfoServlet" method="post">
					<label id="name">用户名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="text" class="input" name="adminName" />
					</label><br /> 
					<label id="password">密&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="password" class="input" name="pwd" />
					</label> 
					<span id="luck">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <br /> 
					<input type="submit" value="登录" class="but" /> 
					<input type="reset" value="取消" class="but" />
				</form>
				<label><font color="red">${error }</font></label>
			</div>
			<div class="end">
				<img src="img/login-wel.gif" />
			</div>
			<div class="buttom">Copyright&copy;2018-2020</div>
		</div>
	</div>
</body>
</html>
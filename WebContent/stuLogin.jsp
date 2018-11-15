<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<script src="js/login.js"></script>
<script src="js/jquery.min.js"></script>
 <link href="https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css" rel="stylesheet">
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
				<form action="StuLoginServlet" method="post">
					<div class="login">
                    <input type="radio" value="学生登录" checked="checked" name="Login" />学生登录
                    <input type="radio" value="教师登录" name="Login" />教师登录
                    </div>
				    <label id="card">学号/教工号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="text" class="input" name="CardId" />
					</label><br /> 
					<label id="name">用户名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<input type="text" class="input" name="Name" />
					</label><br /> 
					<label id="password">密&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="password" class="input" name="Pwd" />
					</label><br /> 
					<button class="btn btn-outline-primary btn-lg" type="submit">登录</button> 
					<button class="btn btn-outline-danger btn-lg" type="reset">取消</button>
				</form>
			</div>
			
			<div class="end1">
			    <label><font color="red">${error }</font></label><br />
				New to us?<a href="regist.jsp">sign up</a> 
			</div>
			
			<div class="end">
				<img src="img/login-wel.gif" />
			</div>
			<div class="bottom">Copyright&copy;2018-2020</div>
		</div>
	</div>
</body>
</html>
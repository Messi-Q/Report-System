<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>管理员登录</title>
<link rel="manifest" href="%PUBLIC_URL%/manifest.json">
<link rel="shortcut icon" href="%PUBLIC_URL%/favicon.ico">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.css"
	rel="stylesheet">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.js"></script>
<link rel="stylesheet" href="css/loginForm.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<form action="AdminInfoServlet" class="loginform" method="post">
				    <span><font color="red">${error }</font></span>
					<h1 class="login">管理员登录</h1>
					<div class="form-group">
						<label class="control-label">管理员账号：</label> <input
							class="form-control" type="text" name="adminName"
							placeholder="输入账号" />
					</div>

					<div class="form-group">
						<label class="control-label">密码：</label> <input
							class="form-control" type="password" name="pwd"
							placeholder="输入密码" />
					</div>

					<div class="form-group">
						<button class="btn btn-outline-primary btn-lg btn-block btnlogin">
							登录</button>
						<br />
					</div>

				</form>
			</div>
		</div>
	</div>
	<div>
		<span class="bottom"><font color="white">Copyright&copy;2018-2020</font></span>
	</div>
</body>
</html>
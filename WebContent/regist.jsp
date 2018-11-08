<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Sign up</title>
    <!-- Bootstrap core CSS -->
    <link href="https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css" rel="stylesheet">
    <link rel="stylesheet" href="css/regist.css" />
    <script type="text/javascript" src="js/regist.js"></script>
  </head>

  <body class="middle">
    <form class="form-signin" action="UserRegisterServlet" method="post" id="form">
      <div align="center">
      <h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>
      <input type="radio" value="Student Regist" checked="checked" name="Regist" />Student Regist
      <input type="radio" value="Teacher Regist" name="Regist" />Teacher Regist
      </div>
      <label for="inputUsername" class="control-label">User name:</label>
      <input type="text" id="UserName" name ="UserName" class="form-control" placeholder="Username" required autofocus>
      <label><font color="red">${error }</font></label>
      
      <label for="inputEmail" class="control-label">Email address:</label>
      <input type="email" id="Email" name="Email" class="form-control" placeholder="Email address" required autofocus>
      
      <label for="inputCard" class="control-label">CardId:</label>
      <input type="text" id="Card" name="Card" class="form-control" placeholder="Card" required autofocus>
      
      <label for="inputPassword" class="control-label">Password:</label>
      <input type="password" id="UserPwd" name="UserPwd" class="form-control" placeholder="Password" required>
      
      <label for="inputPassword" class="control-label">Confirm Password:</label>
      <input type="password" id="IsPwd" name="IsPwd" class="form-control" placeholder="Confirm Password" required>
      
      <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="return checkAll()">Sign up</button>
      <div align="center">
      <a href="stuLogin.jsp">Exist Account</a>
      </div>
      <div align="center">
      <p class="mt-5 mb-3 text-muted">Copyright&copy;2018-2020</p>
      </div>
    </form>
    
  </body>
</html>
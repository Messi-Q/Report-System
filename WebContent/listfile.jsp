<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>下载文件显示页面</title>
</head>
<body>
	<c:forEach items="${fileNameMap }" var="file">
		<c:url value="DownLoadServlet" var="downurl">
			<c:param name="filename" value="${file.key}"></c:param>
		</c:url> 
       ${file.value}<a href="${downurl}">下载</a>
		<br />
	</c:forEach>
</body>
</html>
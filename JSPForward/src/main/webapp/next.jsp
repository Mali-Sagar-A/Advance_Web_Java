<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.write(request.getParameter("uname"));
	out.write(request.getParameter("pwd"));
	
%>
<br>
username:${param.uname}
<br><br>
Password:${param.pwd}
</body>
</html>
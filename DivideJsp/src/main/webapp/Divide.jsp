<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int n1= Integer.parseInt(request.getParameter("num1"));
	int n2= Integer.parseInt(request.getParameter("num2"));
	
	int c=n1/n2;
	
	out.write("c ="+c);

%>

</body>
</html>
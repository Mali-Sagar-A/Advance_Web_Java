<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.app.bean.Customer"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
List<Customer> l= new ArrayList<Customer>();
l.add(new Customer("Sagar","Mali","Sagar@gamil.com",true));
l.add(new Customer("Prasad","Patil","Prasad@gamil.com",true));
l.add(new Customer("Tejas","Jadhav","Tejas@gamil.com",false));
l.add(new Customer("Viki","Kamble","Viki@gamil.com",false));
l.add(new Customer("Zakan","Zulya","Zakan@gamil.com",true));

pageContext.setAttribute("listCustomer", 1);
%>
</head>
<body>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
</tr>
<c:forEach var="temp" items="${listCustomer}">
<c:if test="${temp.status }">
<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>${temp.email}</td>
</tr>

</c:if>

</c:forEach>

</table>
</body>
</html>
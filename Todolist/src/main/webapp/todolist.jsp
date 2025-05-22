<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1.Create a HTML Form -->
<form action="todoDemo.jsp">
Add New Item:<input type="text" name="theItem">
<input type="submit" value="SUBMIT">

<!-- 2. Add a New Item To do List -->
<%
	//get the ToDo items From thw session
	
	List<String> items=(List<String>)session.getAttribute("myToDolist");
	
	//if the Todo items dosent exit ,then create a new  one
	
	if(items==null)
	{
		items=new ArrayList<String>();
		session.setAttribute("myToDolist",items);
	}
	
	//see if there is from data to add
	
	String theItem =request.getParameter("theItem");
	if(theItem!="" && theItem!=null)
	{
		items.add(theItem);
	}
	

%>
<!-- Step3: Display all the  ToDo items from Session -->
<hr>
<b>To List items:</b><br>

<ol>
<%
	for(String temp:items)
	{
		out.println("<li>"+temp+"</li>");
	}

%>

</ol>


</form>
</body>
</html>
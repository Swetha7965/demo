<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Welcome user...
	
	<%
p
 UserTable user=(UserTable)request.getAttribute("user")
%>

	<%=user %>
	
	<h3>
	<%=user.getFName %>
	</h3>
</body>
</html>
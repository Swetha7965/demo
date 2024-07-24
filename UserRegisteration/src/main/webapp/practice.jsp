<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%! String []  fruits= { "guava" , "grapes" , "water melon", "litchi" , "musk melon" , "mango" , "orange" } ;%>
	
	<% String str=" ";
	for(int i=1; i<fruits.length; i++) { 
	
			str=fruits[i]; 
			}
			%>
	
	<%= str %>

</body>
</html>
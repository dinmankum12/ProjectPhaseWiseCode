<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Product Details....</h1>
<hr>
<%= "Product Id : " + session.getAttribute("pid") %> <br> <br>
<%= "Product Id : " + session.getAttribute("pid1") %> <br> <br>


<%= "Product Name : " + session.getAttribute("pname") %>  <br> <br>
<%= "Product Name : " + session.getAttribute("pname1") %>  <br> <br>


<%= "Product Price : " + session.getAttribute("pprice") %><br> <br>
<%= "Product Price : " + session.getAttribute("pprice1") %>



</body>
</html>
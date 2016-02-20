<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (session.getAttribute("auth")== null){
	response.sendRedirect("login.jsp");
}
%>

<h5> Viewing Database Entries: </h5>
<a href="addBooks.jsp"> Add new books</a>
<br>
<a href="delBooks.jsp"> Delete books</a>
<br>
<a href="searchBooks.jsp"> Search books</a>

</body>
</html>
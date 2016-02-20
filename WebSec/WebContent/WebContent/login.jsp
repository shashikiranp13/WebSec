<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyApp Login</title>
</head>
<body>
<h4> MyApp </h4>

<form name="Login" action="Login" method="post">
User name: <input type=text name="userid"> 
<br>
Password: <input type=text name="password">
<input type="submit" value="login">
</form>
<br>
<a href="register.jsp"> Create account </a>
<br>

<br><br>
<h5> Viewing Database Entries: </h5>
<a href="users.jsp"> View Users Details</a>
<br>
<a href="books.jsp"> View Books </a>

</body>
</html>
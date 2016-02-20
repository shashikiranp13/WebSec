<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Vulnerability</title>
</head>
<body>
<h5> XSS Testing</h5>

<form name="xss" action="Xss" method="post">
Malicious Input: <input type="text" name="input"> 
<br> <br>
Choose your reflection point: <input type="text" name="rule"> 
<br> <br>
Input validation: <input type="radio" name="validation" value="1" > Yes
<input type="radio" name="validation" value="0" checked="checked"> No 
<br>
Output encoding: <input type="radio" name="encoding" value="1" > Yes
<input type="radio" name="encoding" value="0" checked="checked"> No
<br>
Enable X-XSS-Protection Response Header: <input type="radio" name="xss-header" value="1" > Yes
<input type="radio" name="xss-header" value="0" checked="checked"> No
<br>
Implement Content Security Policy (CSP): <input type="radio" name="csp" value="1" > Yes
<input type="radio" name="csp" value="0" checked="checked"> No
<br> <br>
<input type="submit" value="Submit">
</form>
<br>
<br>
<h4># Reflection Point: choose where your input data reflects back in HTTP response </h4>
<ul>
<li> 1.1 ==> html tag  
<li> 1.2 ==> body tag
<li> 1.3 ==> b tag  
<li> 1.4 ==> p tag
<li> 2.1 ==> html common attributes
<li> 2.2 ==> html common attributes - inside single quote
<li> 2.3 ==> html common attributes - inside double quote
<li> 3.1 ==> inside a quoted string
<li> 3.2 ==> one side of a quoted expression
<li> 3.3 ==> inside quoted event handler
<li> 3.3 ==> windows.setInterval('even if you escape data your are xssd here') 
</ul>

</body>
</html>
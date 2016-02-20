<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.db.MyDBConn.DbConnectionMySQL" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.PreparedStatement" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View all users</title>
</head>
<body>
<table border="1">
<tr>
<td><b>Userid</b></td>
<td><b>Password</b></td>
<td><b>Name</b></td>
<td><b>Phone</b></td>
</tr>
<% DbConnectionMySQL conn= new DbConnectionMySQL();
Statement smt=null;
ResultSet rs= null;

try {
	
	smt=conn.getDBInitializer().createStatement();
	rs= smt.executeQuery("Select * from UserDetails");
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>");out.println(rs.getString("userid"));out.println("</td>");
		out.println("<td>");out.println(rs.getString("password"));out.println("</td>");
		out.println("<td>");out.println(rs.getString("name"));out.println("</td>");
		out.println("<td>");out.println(rs.getString("phone"));out.println("</td>");
		out.println("</tr>");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally{
	if (rs!=null)
		rs.close();
	if (smt!=null)
		smt.close();
	if (conn!=null)
		conn.close();
	}
%>
</table>
</body>
</html>
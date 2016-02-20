package com.db.MyDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionMySQL {
	Connection conn=null;
	public Connection getDBInitializer() throws ClassNotFoundException {

		String driver = "jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="toor";
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(driver,username,password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void close() throws SQLException{
		if (conn!=null){
			conn.close();
		}
	}
}

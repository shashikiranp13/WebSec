package com.servlet;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.db.MyDBConn.DbConnectionOracle;

public class TestOracle {

	DbConnectionOracle conn= new DbConnectionOracle();
	Statement smt=null;
	
	public void testConnection(){
	try {
		smt=conn.getDBInitializer().createStatement();
		
		ResultSet rs = smt.executeQuery("select * from sys.user$");
		while(rs.next()){
			System.out.println(rs.getString("password"));
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public static void main(String args[]){
	TestOracle ora = new TestOracle();
	ora.testConnection();
}
}

package com.servlet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.MyDBConn.DbConnectionMSSQL;

public class TestMSSQL {

	DbConnectionMSSQL conn= new DbConnectionMSSQL();
	Statement smt=null;
	
	public void testConnection(){
	try {
		smt=conn.getDBInitializer().createStatement();
		
		ResultSet rs = smt.executeQuery("select * from dbo.T_accounts");
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public static void main(String args[]){
	TestMSSQL ora = new TestMSSQL();
	ora.testConnection();
}
}

package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.MyDBConn.DbConnectionMySQL;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userid= request.getParameter("userid");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		int phone=Integer.parseInt(request.getParameter("phone"));
		
		DbConnectionMySQL conn= new DbConnectionMySQL();
		Statement smt=null;
		
		try {
			smt=conn.getDBInitializer().createStatement();
			int count= smt.executeUpdate("insert into UserDetails values('"+userid+"','"+password+"','"+name+"',"+phone+")");
			
			if (count>0){
				System.out.println("Success: user created");
			
			}
			else{
				System.out.println("Falure");
			}

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			try{
			if (smt!=null)
				smt.close();
			if (conn!=null)
				conn.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}

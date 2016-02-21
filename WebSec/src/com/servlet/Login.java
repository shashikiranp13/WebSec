package com.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.MyDBConn.DbConnectionMySQL;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String userid= request.getParameter("userid");
		String password=request.getParameter("password");
		
		DbConnectionMySQL conn= new DbConnectionMySQL();
		Statement smt=null;
		ResultSet rs=null;
		
		
		try {
			smt=conn.getDBInitializer().createStatement();
			rs= smt.executeQuery("select * from UserDetails where userid='"+userid+"' and password='"+password+"'");
			
			if (rs.next()){
				HttpSession session = request.getSession();
				session.setAttribute("auth", userid);
				response.sendRedirect("welcome.jsp");
			}
			
			else {
				response.sendRedirect("login.jsp");
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
				System.out.println("exception ");
				e.printStackTrace();
			}
	}
	}

}

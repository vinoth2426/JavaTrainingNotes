package com.Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		System.out.println("step 1");
		          
		String n=request.getParameter("name");  
		String e=request.getParameter("email");  
		String p=request.getParameter("pno");  
		String a=request.getParameter("address");  
		String cou=request.getParameter("userCountry");
		String gen=request.getParameter("gender");		

		System.out.println("step 2");
		          
		try{   System.out.println("step 3");
			 Class.forName("com.mysql.jdbc.Driver");  
			 System.out.println("step 4");
			 Connection  con=DriverManager.getConnection
		             ("jdbc:mysql://localhost:3306/student","root","admin");  
			 System.out.println("step 5");
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into student_reg values(?,?,?,?,?,?)");  
		  
		ps.setString(1, n);
		ps.setString(2, e);
		ps.setString(3, p);
		ps.setString(4, a);
		ps.setString(5, cou);
		ps.setString(6, gen);        
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered ...");  
		              
		}
		catch (Exception e2)
		{
			System.out.println(e2);
			}  
		          
		out.close();  
	}

}

package com.Demo;

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
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		System.out.println("step 1");
		          
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("email");  
		String num=request.getParameter("Number"); 
		String date=request.getParameter("date"); 
		String userCountry=request.getParameter("userCountry"); 
		

		System.out.println("step 2");
		          
		try{   System.out.println("step 3");
			 Class.forName("com.mysql.jdbc.Driver");  
			 System.out.println("step 4");
			 Connection  con=DriverManager.getConnection
		             ("jdbc:mysql://localhost:3306/jovin","root","admin");  
			 System.out.println("step 5");
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into Employee values(?,?,?,?,?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,p);
		ps.setString(3,e);
		ps.setString(4,num);  
		ps.setString(5,date);
		ps.setString(6,userCountry);
		          
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

package com.DataBase;
import java.io.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
System.out.println("step 1");
          
String n=request.getParameter("userName");  
String p=request.getParameter("userPass"); 
String e=request.getParameter("email");
String number=request.getParameter("Number");
String country=request.getParameter("userCountry");


          
try{   System.out.println("step 3");
	 Class.forName("com.mysql.jdbc.Driver");  //Load Driver Class
	 System.out.println("step 4");
	 Connection  con=DriverManager.getConnection
             ("jdbc:mysql://localhost:3306/SampleDataBase","root","admin");  
	 System.out.println("step 5");
  
PreparedStatement ps=con.prepareStatement(  
"insert into studentdetails values(?,?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);
ps.setString(4,number);
ps.setString(5,country);
          
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
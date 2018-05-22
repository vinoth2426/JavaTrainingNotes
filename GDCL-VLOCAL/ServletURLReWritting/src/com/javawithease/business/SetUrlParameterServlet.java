package com.javawithease.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* This class is used to set the parameters in the url.
* @author javawithease
*/
public class SetUrlParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//no-argument constructor.
    public SetUrlParameterServlet() {
       
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
	            throws ServletException, IOException {
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	//get parameters from request object.
    	String userName = request.getParameter("userName").trim();
    	String password = request.getParameter("password").trim();
    	
    	//check for null and empty values.
    	if(userName == null || userName.equals("") || 
    			password == null || password.equals("")){
    		out.print("Please enter both username and " +
    				"password. <br/><br/>");
    		RequestDispatcher requestDispatcher = 
    			request.getRequestDispatcher("/login.html");
    		requestDispatcher.include(request, response);
    	}//Check for valid username and password.
    	else if(userName.equals("jai") && password.equals("1234")){
    		out.println("Logged in successfully.<br/>"); 
    		out.println("Click on the below link to see " +
    				"the values of Username and Password.<br/>");
    		out.println("<a href='GetUrlParameterServlet?userName="
    			+userName+"&password="+password+"'>Click here</a>");
    	}else{
    		out.print("Wrong username or password. <br/><br/>");
    		RequestDispatcher requestDispatcher = 
    			request.getRequestDispatcher("/login.html");
    		requestDispatcher.include(request, response);
    	}
	}
}

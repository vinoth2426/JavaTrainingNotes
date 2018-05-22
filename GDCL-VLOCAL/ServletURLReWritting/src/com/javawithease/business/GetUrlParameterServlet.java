package com.javawithease.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* This class is used to get the parameter values from url.
* @author javawithease
*/
public class GetUrlParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//no-argument constructor.
    public GetUrlParameterServlet() {
        
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
	              throws ServletException, IOException {
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	//get parameters from request object.
    	String userName = request.getParameter("userName").trim();
    	String password = request.getParameter("password").trim();
    	
    	out.println("Username: " + userName + "<br/><br/>");
    	out.println("Password: " + password);
    	
    	out.close();
	}

}

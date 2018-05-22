package com.javawithease.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class is used to delete cookies.
 * @author javawithease
 */
public class DeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//no-argument constructor
    public DeleteCookieServlet() {
        
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
	                throws ServletException, IOException {
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	 
    	try{
    		Cookie cookies[] = request.getCookies();
    		out.print("Deleted cookie are:");
    		for(Cookie cookie : cookies){
    			cookie.setMaxAge(0);
    			out.println("Cookie name: " + cookie.getName());
    			out.println("Cookie Value: " + cookie.getValue());
    		}
    	    
    	    out.close();  
    	}catch(Exception e){
    		e.printStackTrace();
    	}
	}
}

package com.details;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Welcome() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String n=request.getParameter("name");
	    String e=request.getParameter("email");
	    
	    out.println("Name is"+n);
	    out.println("Email is"+e);
	    out.close();
	    */
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String n=request.getParameter("name");
	    String e=request.getParameter("email");
	    String a=request.getParameter("age");
	    
	    out.println("Name is"+n);
	    out.println("Email is"+e);
	    out.println("age is"+a);
	    out.close();
	    
	    
	    
	}

}

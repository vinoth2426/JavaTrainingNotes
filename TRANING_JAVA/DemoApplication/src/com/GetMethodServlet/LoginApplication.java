package com.GetMethodServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginApplication
 */
//@WebServlet("/LoginApplication")
public class LoginApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out =response.getWriter();
		 
		    String name=request.getParameter("userName");
			String password=request.getParameter("password");

			//System.out.println("step2");
			out.println("Hello THis Get Method ::::::;"+name);
			
			out.println("Hello THis Get Method ::::::;"+password);
		 
	}

}

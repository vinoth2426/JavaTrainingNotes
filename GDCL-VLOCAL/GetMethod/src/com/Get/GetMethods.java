package com.Get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetMethods
 */
//@WebServlet("/GetMethods")
public class GetMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//System.out.println("step1");
		PrintWriter  out=response.getWriter();
		String name=request.getParameter("UserName");
		String email=request.getParameter("email");

		//System.out.println("step2");
		out.println("Hello THis Get Method ::::::;"+name);
		
		out.println("Hello THis Get Method ::::::;"+email);
		
		
	}

}

package com.Post;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostMethods
 */
//@WebServlet("/PostMethods")
public class PostMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("step1");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("UserName");
		System.out.println("step2");
		String pass=request.getParameter("PassWord");
		out.println("Post Method:>>>>>>>>>>>>>>>"+name); 
		
		System.out.println("step3");
		out.println("postMethod:>>>>>>>>>>>>>>>>>"+pass);
		
		
	}

}

package com.DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletApp1
 */
//@WebServlet("/HelloServletApp1")
public class HelloServletApp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServletApp1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out =response.getWriter();
		 
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
        String Emailid=request.getParameter("Email id");
        String Phno=request.getParameter("Ph no");
        String Address=request.getParameter("Address");
        String City=request.getParameter("City");
        String country=request.getParameter("country");
        out.println("FirstName:"+FirstName +"<br/>");
        out.println("LastName:"+LastName +"<br/>");
        out.println("Email id:"+Emailid +"<br/>");
        out.println("ph no:"+Phno+"<br/>");
        out.println("Address:"+Address+"<br/>");
        out.println("City:"+City+"<br/>");
        out.println("country:"+country+"<br/>");
        
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

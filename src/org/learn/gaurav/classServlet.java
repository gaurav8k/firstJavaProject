package org.learn.gaurav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class classServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("Testing from Class Servlet");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		writer.println("Am from classServlet(GET Method) " + name);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Testing from Class Servlet");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		writer.println("Am from classServlet(POST Method) " + name);	
	}
}

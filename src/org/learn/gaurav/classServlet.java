package org.learn.gaurav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class classServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("Testing from Class Servlet");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(name != null){
			session.setAttribute("FirstName", name);
			context.setAttribute("FirstName", name);
		}		
		writer.println("<h2>Am from classServlet(GET Method) </h2>" + name + " The session is :" + (String)session.getAttribute("FirstName"));
		writer.println("The context is: " + (String)context.getAttribute("FirstName"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Testing from Class Servlet");
		response.setContentType("text/html");
		String name = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		writer.println("Am from classServlet(POST Method) " + name);	
	}
}

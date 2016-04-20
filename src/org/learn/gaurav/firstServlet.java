package org.learn.gaurav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet(description = "firstServletDescription", urlPatterns = { "/firstServlet" }, 
initParams={@WebInitParam(name="defaultName", value="Gaurav")})
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Hello from Servlet");
		PrintWriter writer = response.getWriter();
		writer.print("DoGet Method from Servlet");
		writer.println("The Init Param" + getServletConfig().getInitParameter("defaultName"));
		
	}

}

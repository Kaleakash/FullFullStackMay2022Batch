package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");		// output consider as a html 
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");// it is use to receieve the value of email field 
		String password = request.getParameter("password");
		if(email.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login<br/>");
			pw.println("You can proccessed....");
		}else {
			pw.println("failure try once again");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");		// output consider as a html 
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");// it is use to receieve the value of email field 
		String password = request.getParameter("password");
		if(email.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login<br/>");
			pw.println("You can proccessed....");
		}else {
			pw.println("failure try once again");
		}
	}

}

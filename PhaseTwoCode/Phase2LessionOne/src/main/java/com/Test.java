package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");

		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		if(email.equalsIgnoreCase("dinesh94@gmail.com") && password.equals("Dinesh@123")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else {
			rd= request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.print("<center> <span style = 'color:red'>Invalid credentials!!</span> </center>");
			}
		}

	}



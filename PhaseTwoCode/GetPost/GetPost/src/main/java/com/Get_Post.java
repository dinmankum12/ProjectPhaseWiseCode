package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MySevlet")
public class Get_Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Get_Post() {
        super();
        // TODO Auto-generated constructor stub
    }

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out= response.getWriter();
//		out.print("<h1>Hello World, Service Method</h1>");
//	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String name = request.getParameter("fname");
		out.print("<h1>Hello World, doGet Method</h1>");
		out.print("<br/> Hello " + name);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String name = request.getParameter("fname");
		out.print("<h1>Hello World, doPost Method</h1>");
		out.print("<br/> Hello " + name);
	}

}

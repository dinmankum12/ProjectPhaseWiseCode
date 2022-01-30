package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.Classess;
import main.Students;
import main.Subjects;
import main.Teachers;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

//		Check whether the session already exists
		if (session.getAttribute("userName") != null) {

			out.println("<h3>Welcome " + session.getAttribute("userName"));

			out.println("<br> You are now logged in...");
			
			out.println("<br>Deshboard of Administrative</h3>");

			
			out.println("<p><h4><a href='students'>View All Students Details</a></h4>\n");
			out.println("<p><h4><a href='classes'>View All Classes Details</a></h4>\n");
			out.println("<p><h4><a href='subjects'>View All Subjects Details</a></h4>\n");
			out.println("<p><h4><a href='teachers'>View All Teachers Details</a></h4>\n");
			out.println("<p><h4><a href='logout'>LOGOUT</a></h4>");
		}

		else {
			response.sendRedirect("index.html");
		}

	}

}

package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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

@WebServlet("/students")
public class students extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url="jdbc:mysql://localhost:3306/details";
		String uname="root";
		String pass="";
		
		response.setContentType("text/html");
		
		//String pId = request.getParameter("p_ID");
	
		PrintWriter out = response.getWriter();
		
		String query="select * from students";
		out.print("<h1>Displaying the Students Details...</h1>");
		out.print("<table border='1'><tr><th>User Name</th><th>User Id</th><th>User Location</th><th>Section</th></tr>");
		
		try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection dbCon = DriverManager.getConnection(url, uname, pass);
	      PreparedStatement st=  dbCon.prepareStatement(query);
	      
	     // st.setString(1, pId);
	      
	      ResultSet rs =st.executeQuery();
	      
	      while(rs.next()) {
	    	  
	    	  out.print("<tr><td>");
	    	  out.println(rs.getString(1));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(2));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(3));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(4));
	    	  out.print("</td>");
	    	  out.print("</tr>");
	    
	    	 
			}
	      
		}
		catch(Exception e){
			
			System.out.println("Some Issue : "+ e.getMessage());
			
			
		}
		
		out.print("</table>");
		 out.println("<p><h4><a href='dashboard'>Back to deshboard</a></h4>");
	}

}
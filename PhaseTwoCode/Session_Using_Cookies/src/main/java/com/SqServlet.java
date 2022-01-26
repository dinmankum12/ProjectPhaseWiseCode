package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SqServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//int k = (int) req.getAttribute("k");
		int k=0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
				
		}
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.print("<h1>Result is : "+k+"</h1>");
		
	}

}

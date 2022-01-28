package com.dinesh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pId = request.getParameter("productId");
		String pId1= request.getParameter("productId1");
	
		String pName = request.getParameter("productName");
		String pName1 = request.getParameter("productName1");
		
		String pPrice = request.getParameter("productPrice");
		String pPrice1 = request.getParameter("productPrice1");
		
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("pid", pId);
		theSession.setAttribute("pid1", pId1);
		
		theSession.setAttribute("pname", pName);
		theSession.setAttribute("pname1", pName1);
		
		theSession.setAttribute("pprice", pPrice);
		theSession.setAttribute("pprice1", pPrice1);
		
		
		response.sendRedirect("view.jsp");
		
		
	}

}
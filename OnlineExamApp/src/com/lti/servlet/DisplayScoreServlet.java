package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayScoreServlet
 */
@WebServlet("/DisplayScoreServlet")
public class DisplayScoreServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		 Integer score = (Integer)session.getAttribute("currentScore");
		
		 PrintWriter out = response.getWriter();
		 out.print("<h1> Your Score is: <h1>");
		out.print("<h3>"+score+"</h3>");
		
		
	}

}

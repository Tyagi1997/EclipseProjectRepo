package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.model.QuestionBankLoader;

@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	private List<Question> questions;
	private int noOfQuestions;
	
	
	@Override
	public void init() throws ServletException {
		questions = QuestionBankLoader.loadQuestionsOnJava();              //while loading window we will load all the questions
	    noOfQuestions = questions.size();
	}

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer questionNo = (Integer) session.getAttribute("qNo");
		if(questionNo ==null)
			questionNo = 0;
		else
			questionNo++;
		session.setAttribute("qNo", questionNo);
		if(questionNo==noOfQuestions){
			response.sendRedirect("DisplayScoreServlet");
		}
		else{
		
		Question q = questions.get(questionNo);
		session.setAttribute("currentQs", q);                                 // we need to know for which question radio button is sending answer hence                                                                                           
		response.setContentType("text/html");                              //keep it inside session for again concurrency thing
		
		PrintWriter out = response.getWriter();
		
		/*out.print("<div>");
		out.print("<button type = 'submit' onclick ='"+(q.getQuestion())+"'>Q1</button>");
		out.print("<button type = 'submit'>Q2</button>");
		out.print("<button type = 'submit'>Q3</button>");
		out.print("</div>");*/
	

		
		out.print("<form action='CalculateScoreServlet'>");
		out.println("<h3>"+(questionNo+1)+"."+"\t"+q.getQuestion()+"</h3>");
		int optionNo = 0;
		
		for(Option o: q.getOptions()){
		out.println("<h4>");
		out.print( "<input type='radio'  name='op' value='"+(optionNo++)+"'/>"); 
	    out.print(o.getOption());
	    out.print("</h4>");                       //print this on different lines
		}
		String btnLabel = "Continue";
		if(questionNo == noOfQuestions-1){
			btnLabel = "Finish";
		
		}
		out.print("<button type='submit'>"+btnLabel+"</button>");
		out.print("</form>");
		}
		

	
		
		
		
		
		

	}

}

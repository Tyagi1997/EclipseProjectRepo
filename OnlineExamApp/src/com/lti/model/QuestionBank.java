package com.lti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	                                                                                                  //instead of list<question> we should be sung set to avoid duplicates
	private Map<Subject, List<Question>> questionBank;       //used map so that for each subject we dont need to 
    	                                                                                                 //create questionbank for each and every subject

	public QuestionBank() {
	        questionBank = new HashMap<>();
	}
	
	public void addNewSubject(Subject subject){
		questionBank.put(subject, new ArrayList<>());                       //map ka method put
	}
	
	public void addNewQuestion(Subject subject,Question question){
		List<Question> questions = questionBank.get(subject);
		questions.add(question);
	}
	
	public List<Question> getQuestionsFor(Subject subject){
		return questionBank.get(subject);
	}
	

}

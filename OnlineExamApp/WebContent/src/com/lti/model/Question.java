package com.lti.model;

import java.util.List;

public class Question {
	
	private String question;
	private List<Option> options;                         //list coz option number might vary
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	
	

}
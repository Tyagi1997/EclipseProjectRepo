package com.lti.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	
	public static List<Question> loadQuestionsOnJava(){
	
		QuestionBank qb = new QuestionBank();                                //local variables hence you can give any name to variables (qb,s)
		                                                                                                     //for reusable code give a proper name to variable
		
		Subject s  = new Subject();
		s.setName("Java");
		
		qb.addNewSubject(s);
		
		Question q = new Question();
		q.setQuestion("What is G1 in Java?");
		
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("G1 is Garbage Collector",true));
		ops.add(new Option("G1 is another name for Jeevan",false));
		ops.add(new Option("G1 is name of spy agency",false));
		ops.add(new Option("G1 is sequel of Ra.One",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		 q = new Question();                           // no need to create new object resue existing one  same with options and subject
		q.setQuestion("Which of these is a super class of all errors and exceptions in the Java language?");
		
		ops = new ArrayList<Option>();
		ops.add(new Option("RunTimeExceptions",false));
		ops.add(new Option("Throwable",true));
		ops.add(new Option("Catchable",false));
		ops.add(new Option("None of the above",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
	    q = new Question();
		q.setQuestion("Which of the following is true about inheritance in Java ? "+"\n"+" 1) Private methods are final" +"\n" +"2) Protected members are accessible within a package and  inherited classes outside the package" +"\n" +"3) Protected methods are final." +"\n" +"4) We cannot override private methods.");
		
		ops = new ArrayList<Option>();
		ops.add(new Option("1, 2 and 4",true));
		ops.add(new Option("Only 1 and 2",false));
		ops.add(new Option("1, 2 and 3",false));
		ops.add(new Option("2, 3 and 4",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		q = new Question();
		q.setQuestion("Type IV JDBC driver is a driver");
		
		 ops = new ArrayList<Option>();
		ops.add(new Option("which is written in C++",true));
		ops.add(new Option("which requires an intermediate layer",false));
		ops.add(new Option("which communicates through Java sockets",false));
		ops.add(new Option("which translates JDBC function calls into API not native to DBMS",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		q = new Question();
		q.setQuestion("Which of the following is used to make an Abstract class?");
		
		ops = new ArrayList<Option>();
		ops.add(new Option("Making atleast one member function as pure virtual function",true));
		ops.add(new Option("Making atleast one member function as virtual function",false));
		ops.add(new Option("Declaring as Abstract class using virtual keyword",false));
		ops.add(new Option("Declaring as Abstract class using static keyword",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		/*s  = new Subject();
		s.setName("DBMS");
		
		q = new Question();
		q.setQuestion(" Which of the following represents a relationship among a set of values.");
		
		ops = new ArrayList<Option>();
		ops.add(new Option(" A Row",false));
		ops.add(new Option("A Table",true));
		ops.add(new Option("A Field",false));
		ops.add(new Option("A Column",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		
		q = new Question();
		q.setQuestion("  Which of the following is Relation-algebra Operation?");
		
		ops = new ArrayList<Option>();
		ops.add(new Option("Select",false));
		ops.add(new Option("Union",true));
		ops.add(new Option("Rename",false));
		ops.add(new Option("All of the above",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		q = new Question();
		q.setQuestion("  Disadvantages of File systems to store data is:");
		
		 ops = new ArrayList<Option>();
		ops.add(new Option("Data redundancy and inconsistency",false));
		ops.add(new Option("Difficulty in accessing data",false));
		ops.add(new Option(" Data isolation",false));
		ops.add(new Option("All of the above",true));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);
		
		q = new Question();
		q.setQuestion("   In an Entity-Relationship Diagram Rectangles represents");
		
		ops = new ArrayList<Option>();
		ops.add(new Option(" Entity sets",true));
		ops.add(new Option("Attributes",false));
		ops.add(new Option("Database",false));
		ops.add(new Option("Tables",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);

		q = new Question();
		q.setQuestion("The Primary key must be");
		
		ops = new ArrayList<Option>();
		ops.add(new Option("Non Null",false));
		ops.add(new Option("Unique",false));
		ops.add(new Option("Option A or B",true));
		ops.add(new Option("Option A and B",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s, q);*/
		
		return qb.getQuestionsFor(s);
		
	}

}

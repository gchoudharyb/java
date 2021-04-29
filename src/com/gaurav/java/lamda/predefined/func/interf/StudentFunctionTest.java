package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentFunctionTest {
public static void main(String[] args) {
	List<Strudent> list = new ArrayList<Strudent>();
	Strudent strudent1 = new Strudent("Gaurav", 500);
	Strudent strudent2 = new Strudent("Gaurav", 400);
	Strudent strudent3 = new Strudent("Gaurav", 300);
	Strudent strudent4 = new Strudent("Gaurav", 100);
	list.add(strudent1);
	list.add(strudent2);
	list.add(strudent3);
	list.add(strudent4);
	
	Function<List<Strudent>, List<String>> function = (list1)->
	{
		List<String> grades=new ArrayList<>();
		String grade="";
		for (Strudent strudent : list1) {
			Integer marks = strudent.getStudentMarks();
			
			if(marks>400)
			{
				grade= strudent.getStudentName()+" grade is A";
			}
			else if(marks<400)
			{
				grade= strudent.getStudentName()+" grade is B";
			}
			else
			{
				grade= strudent.getStudentName()+" grade is C";
			}
			grades.add(grade);
		}
		return grades;
	};
	System.out.println(function.apply(list));
}
}

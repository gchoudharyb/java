package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest2 {
	public static void main(String[] args) {
		Strudent strudent1 = new Strudent("gaurav", 80);
		Strudent strudent2 = new Strudent("gaurav1", 90);	
		Strudent strudent3 = new Strudent("gaurav2", 60);	
		Strudent strudent4 = new Strudent("gaurav3", 40);	
		
		ArrayList< Strudent> arrayList = new ArrayList<>();
		arrayList.add(strudent1);
		arrayList.add(strudent2);
		arrayList.add(strudent3);
		arrayList.add(strudent4);
		
		Function<Strudent, String> function = (student)->
		{
			if(student.getStudentMarks()>90)
			{
				return "A+";
			}
			else if(student.getStudentMarks()>=80)
			{
				return "A";
			}
			else if(student.getStudentMarks()>=60)
			{
				return "B";
			}
			else 
			{
				return "FAIL";
			}
		};
		
		Predicate<Integer> predicate = (i)->i>=60;
		Consumer<Strudent> consumer = (studentName)->
		{
			System.out.println("Student name::"+studentName.getStudentName()+" with grade"+function.apply(studentName));
		};
		for (Strudent strudent : arrayList) {
			if(predicate.test(strudent.getStudentMarks()))
			{
				consumer.accept(strudent);
			}
		}
	}
}

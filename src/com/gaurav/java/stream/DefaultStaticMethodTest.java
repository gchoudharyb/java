package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticMethodTest {
public static void main(String[] args) {
	List<String>  list = Arrays.asList("gaurav","kumar","choudhary");
	list.sort((str1,str2)-> str2.compareTo(str1));
	System.out.println(list);
	
	Student student1 = new Student(1, "2", "gaurav1");
	Student student2 = new Student(2, "3", "gaurav1");
	Student student3 = new Student(3, "2", "cgaurav3");
	Student student4 = new Student(4, "4", "bgaurav4");
	Student student5 = new Student(5, "5", "vgaurav5");
	Student student6 = new Student(6, "5", "ngaurav6");
	Student student7 = new Student(7, "3", "mgaurav7");
	Student student8 = new Student(8, "6", "zgaurav8");

	List<Student> studentList = new ArrayList<Student>();
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	studentList.add(student6);
	studentList.add(student7);
	studentList.add(student8);
	System.out.println(studentList);
	studentList.sort(Comparator.comparing(Student::getStudentName));
	System.out.println(studentList);
	studentList.sort(Comparator.comparing(Student::getStudentName).thenComparing(Student::getGrade));
	System.out.println(studentList);
			
}
}

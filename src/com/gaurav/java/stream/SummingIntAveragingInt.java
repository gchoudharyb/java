package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntAveragingInt {
	public static void main(String[] args) {
		Student student1 = new Student(1, "2", "gaurav1");
		Student student2 = new Student(2, "3", "zaurav10");
		Student student3 = new Student(3, "2", "xaurav3");
		Student student4 = new Student(4, "4", "gaurav4");
		Student student5 = new Student(5, "5", "daurav5");
		Student student6 = new Student(6, "5", "faurav6");
		Student student7 = new Student(7, "3", "saurav7");
		Student student8 = new Student(8, "6", "waurav8");

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		
		
		Integer sum = studentList.stream().collect(Collectors.summingInt(Student::getStudentId));
		System.out.println(sum);
		
		Double average = studentList.stream().collect(Collectors.averagingInt(Student::getStudentId));
		System.out.println(average);
	}
}

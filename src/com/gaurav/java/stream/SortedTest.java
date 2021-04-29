package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedTest {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Gaurav");
	list.add("Aaurav");
	list.add("Zaurav");
	list.add("Yaurav");
	list.add("Aaurav");
	
	Stream<String> stream  = list.stream().sorted();
	stream.forEach(System.out::println);
//	stream.forEach(System.out::println);
	
	Stream<String> stream1  = list.stream().sorted((o1,o2)->o2.compareTo(o1));
	stream1.forEach(System.out::println);
	
	Student student1 = new Student(1,"2", "gaurav1");
	Student student2 = new Student(2,"3", "aaurav2");
	Student student3 = new Student(3,"2", "kaurav3");
	Student student4 = new Student(4,"4", "faurav4");
	Student student5 = new Student(5,"5", "daurav5");
	Student student6 = new Student(6,"5", "saurav6");
	Student student7 = new Student(7,"3", "qaurav7");
	Student student8 = new Student(8,"6", "baurav8");
	
	List<Student> studentList = new ArrayList<Student>();
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	studentList.add(student6);
	studentList.add(student7);
	studentList.add(student8);
	
	Stream<Student> stream2 = studentList.stream().sorted(Comparator.comparing(Student::getStudentName));
	stream2.forEach(System.out::println);
	
	List<Student> sortedStudent = studentList.stream().sorted(Comparator.comparing(Student::getGrade).reversed()).collect(Collectors.toList());
	System.out.println(sortedStudent);
	
}
}

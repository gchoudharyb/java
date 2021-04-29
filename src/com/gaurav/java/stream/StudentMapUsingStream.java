package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMapUsingStream {
	public static void main(String[] args) {
		Student student1 = new Student(13, "A", "Gaurav1");
		Student student2 = new Student(2, "A1", "Gaurav2");
		Student student3 = new Student(3, "A1", "Gaurav4");
		Student student4 = new Student(1, "A2", "Gaurav5");
		Student student5 = new Student(10, "A1", "Gaurav4");
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		List<Integer> integers = new ArrayList<>();
		students.forEach((s) -> integers.add(s.getStudentId()));
		System.out.println(students);

		Map<Integer, String> map = students.stream().peek(System.out::println).collect(Collectors.toMap(Student::getStudentId, Student::getGrade));
		System.out.println(map);
	}
}

package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMapValueUsingJava8 {
	public static void main(String[] args) {
		Map<Student, Address> mapStudent = new TreeMap<Student, Address>();
		Student student1 = new Student(10, "gaurav");
		Student student2 = new Student(101, "aaurav");
		Student student3 = new Student(1002, "zaurav");

		Address address1 = new Address("11", "zatest");
		Address address2 = new Address("2111", "aaaaaest");
		Address address3 = new Address("13", "qwqwqwxest");
		mapStudent.put(student1, address1);
		mapStudent.put(student2, address2);
		mapStudent.put(student3, address3);
		System.out.println(mapStudent);
		List<Map.Entry<Student, Address>> listFromMap = new ArrayList<Map.Entry<Student,Address>>(mapStudent.entrySet());
		Collections.sort(listFromMap, (o1,o2) -> o1.getValue().getStudentAddress().compareTo(o2.getValue().getStudentAddress()));
		Map<Student, Address> finalMap = new LinkedHashMap<Student, Address>();
		listFromMap.forEach((o1) -> finalMap.put(o1.getKey(),o1.getValue()));
		System.out.println(listFromMap);
	}
}

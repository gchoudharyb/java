package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeSetSortUsingValue {
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

		List<Map.Entry<Student, Address>> entries = new ArrayList<Map.Entry<Student, Address>>(mapStudent.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<Student, Address>>() {

			@Override
			public int compare(Entry<Student, Address> o1, Entry<Student, Address> o2) {

				return o1.getValue().getStudentAddress().compareTo(o2.getValue().getStudentAddress());
			}
		});

		Map<Student, Address> finalSortedTreeMap = new LinkedHashMap<Student, Address>();

		for (Map.Entry<Student, Address> entry : entries) {
			finalSortedTreeMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(finalSortedTreeMap);

	}
}

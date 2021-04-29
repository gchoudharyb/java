package com.gaurav.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapValueUsingJava8Test {
	public static void main(String[] args) {
		Map<Student, Address> map = new HashMap<Student, Address>();
		Student student1 = new Student(1, "Gaurav");
		Student student2 = new Student(2, "Rohit");
		Student student3 = new Student(3, "Lalit");
		Student student4 = new Student(4, "Amit");
		Student student5 = new Student(5, "Zebra");

		Address address1 = new Address("1", "Delhi");
		Address address2 = new Address("2", "Shambhuganj");
		Address address3 = new Address("3", "Banka");
		Address address4 = new Address("4", "Karsop");
		Address address5 = new Address("5", "Test");

		map.put(student1, address1);
		map.put(student2, address2);
		map.put(student3, address3);
		map.put(student4, address4);
		map.put(student5, address5);

		System.out.println("___________Before Sort_____________________");
		System.out.println(map);
		System.out.println("___________After Sort_____________________");

		List<Map.Entry<Student, Address>> mapList = new ArrayList<Map.Entry<Student, Address>>(map.entrySet());

		Collections.sort(mapList, new Comparator<Map.Entry<Student, Address>>() {

			@Override
			public int compare(Entry<Student, Address> o1, Entry<Student, Address> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getStudentAddress().compareToIgnoreCase(o1.getValue().getStudentAddress());
			}
		});
		LinkedHashMap<Student, Address> linkedHashMap = new LinkedHashMap<>();
		for (Entry<Student, Address> entry : mapList) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(linkedHashMap);
		LinkedHashMap<Student, Address> resultMap = new LinkedHashMap<>();
		mapList.stream().sorted((o1,o2)->o2.getValue().getStudentAddress().compareTo(o1.getValue().getStudentAddress())).forEach((o1)->resultMap.put(o1.getKey(), o1.getValue()));
		System.out.println("___________Using Java 8_________");
		System.out.println(resultMap);
	}
	
}

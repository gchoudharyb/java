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

public class MapSortBasedOnValue {
	public static void main(String[] args) {
		HashMap<Student, Address> hashMap = new HashMap<>();
		Student student1 = new Student(10, "gaurav");
		Student student2 = new Student(10, "aaurav");
		Student student3 = new Student(10, "zaurav");

		Address address1 = new Address("11", "zatest");
		Address address2 = new Address("2111", "aaaaaest");
		Address address3 = new Address("13", "qwqwqwxest");

		hashMap.put(student1, address1);
		hashMap.put(student2, address2);
		hashMap.put(student3, address3);
		System.out.println(hashMap);

		List<Map.Entry<Student, Address>> entries = new ArrayList<Map.Entry<Student, Address>>(hashMap.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<Student, Address>>() {

			@Override
			public int compare(Entry<Student, Address> o1, Entry<Student, Address> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getStudentAddress().compareTo(o2.getValue().getStudentAddress());
			}

		});

		Map<Student, Address> hashMapFinal = new LinkedHashMap<>();

		for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
			Entry<Student, Address> entry = (Entry<Student, Address>) iterator.next();
			hashMapFinal.put(entry.getKey(), entry.getValue());

		}
		System.out.println(hashMapFinal);

	}
}

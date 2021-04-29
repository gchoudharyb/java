package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueAndOrdered {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// 5,4,3,5,5,4,3,2,2,2,9
		list.add("5");
		list.add("4");
		list.add("3");
		list.add("5");
		list.add("5");
		list.add("4");
		list.add("3");
		list.add("2");
		list.add("2");

		list.add("9");
		
		List<String> strings  = list.stream().sorted((s1,s2)->s2.compareTo(s1)).distinct().collect(Collectors.toList());
		
		System.out.println(strings);
		
		
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.put("gaurav", "tejaswini"));
		System.out.println(map.put("gaurav", "tejaswini"));

	}
}

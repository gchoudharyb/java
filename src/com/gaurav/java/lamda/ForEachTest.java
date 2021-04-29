package com.gaurav.java.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("gaurav");
		list.add("Kumar");
		list.add("Choudhary");

		list.forEach((System.out::println));

		Consumer<String> consumer1 = (System.out::println);
		Consumer<String> consumer2 = ((s) -> System.out.println("Hi"));

		list.forEach(consumer1.andThen(consumer2));

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("gaurav", 1);
		
		hashMap.forEach((key,value) -> System.out.println(key+"::"+value));

	}
}

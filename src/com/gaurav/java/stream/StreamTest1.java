package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			integers.add(i);

		}
		Stream<Integer> streams = integers.stream().filter((input) -> input % 2 == 0);
		List<Integer> evens = streams.collect(Collectors.toList());
		System.out.println(evens);

		List<Integer> doubleList = integers.stream().map((i) -> i * i).collect(Collectors.toList());
		System.out.println(doubleList);
		System.out.println(integers);
		Stream<Object> stream = integers.stream().map((i) -> i * i).flatMap((t)->Arrays);
		
		System.out.println(stream);
	}
}
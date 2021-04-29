package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfNnumber {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer sum = integers.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum);
		
		//or
		
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).max());
		System.out.println(IntStream.rangeClosed(1, 10).min());
		System.out.println(IntStream.rangeClosed(1, 10).count());
		System.out.println(IntStream.rangeClosed(1, 10).average());
	}
}

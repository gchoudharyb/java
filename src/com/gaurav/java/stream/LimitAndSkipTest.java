package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipTest {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,5,2,1,4,7,8,9,3,5,5,6,2,2,6,6,66,44,55,11,22,33,33,33555,11111);
		
		
		List<Integer> limitInteger = integers.stream().limit(10).collect(Collectors.toList());
		System.out.println(limitInteger);
		
		List<Integer> skipInteger = integers.stream().skip(10).collect(Collectors.toList());
		
		System.out.println(skipInteger);
	}
}

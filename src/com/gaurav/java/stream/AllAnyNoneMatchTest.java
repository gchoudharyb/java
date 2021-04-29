package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnyNoneMatchTest {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,5,7,6,9,4,2,1,3,5,6,5,1,0,8,9,100,1000,5,25,125);
		boolean result1=integers.stream().anyMatch((i) -> i%2==0);
		System.out.println(result1);
		boolean result2=integers.stream().allMatch((i) -> i%2==0);
		System.out.println(result2);
		boolean result3=integers.stream().noneMatch((i) -> i%2==0);
		System.out.println(result3);
	}
}

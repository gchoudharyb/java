package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.List;

public class LimitSkipTest {
public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1, 3, 0, 5);
	
	integers.stream().limit(2).forEach(System.out::println);
	
	System.out.println("________________________________________________________________________");
	
	integers.stream().skip(2).forEach(System.out::println);
}
}

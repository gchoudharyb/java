package com.gaurav.java.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedAndUnboxedTest {
public static void main(String[] args) {
	List<Integer> integers = IntStream.range(1, 11).boxed().collect(Collectors.toList());
	System.out.println(integers);
	
	IntStream stream = integers.stream().mapToInt(Integer::intValue);
}
}
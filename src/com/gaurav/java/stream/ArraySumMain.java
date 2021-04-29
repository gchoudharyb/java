package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySumMain {
	public static void main(String[] args) {
		int [] arr= new int [] {1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(arr).sum();
		Stream<int[]> stream = Stream.of(arr);
		IntStream intStream = stream.flatMapToInt(Arrays::stream);
	}
}

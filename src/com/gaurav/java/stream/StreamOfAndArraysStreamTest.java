package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfAndArraysStreamTest {
	public static void main(String[] args) {
		// Creating an integer array
		int arr[] = { 1, 2, 3, 4, 5 };

		// --------- Using Arrays.stream() ---------

		// to convert int array into Stream
		IntStream intStream = Arrays.stream(arr);

		// Displaying elements in Stream
		intStream.forEach(str -> System.out.print(str + " "));

		// --------- Using Stream.of() ---------

		// to convert int array into Stream
		Stream<int[]> stream = Stream.of(arr);

		// ***** Flattening of Stream<int[]> into IntStream *****

		// flattenning Stream<int[]> into IntStream
		// using flatMapToInt()
		IntStream intStreamNew = stream.flatMapToInt(Arrays::stream);
		System.out.println();
		// Displaying elements in IntStream
		intStreamNew.forEach(str -> System.out.print(str + " "));
		Stream.iterate(0, (num)-> num*2).limit(10).forEach(System.out::println);
		Stream.generate(()-> Math.random()).limit(20).forEach(System.out::println);
		
		IntStream.range(10, 50)
	}
}

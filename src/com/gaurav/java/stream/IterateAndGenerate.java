package com.gaurav.java.stream;

import java.util.Random;
import java.util.stream.Stream;

public class IterateAndGenerate {
public static void main(String[] args) {
	Stream<String> stream = Stream.of("gaurav","Kumar","choudhary");
	
	Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
	Stream.iterate(1, (i)->i*i).limit(5).forEach(System.out::println);;
}
}

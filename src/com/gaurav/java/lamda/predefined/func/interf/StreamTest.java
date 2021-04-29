package com.gaurav.java.lamda.predefined.func.interf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		long l = Arrays.stream(new String[] { "gaurav", "kumar", "choudhary" }).filter(str -> str.length() > 5).count();
		System.out.println(l);
		Stream<String> song = Stream.of("gently", "down", "the", "stream").map((w) -> w.toUpperCase());
		song.forEach(System.out::println);
		Stream<String> echos = Stream.generate(() -> "Echo").limit(100);
		System.out.println(echos.count());
		Stream<Double> randoms = Stream.generate(Math::random).limit(100);
		System.out.println(randoms.count());
		Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(5);
		integers.forEach(System.out::println);

		Stream<String> words = Stream.of("gaurav");
		Stream<Stream<Character>> result = words.map(w -> characterStream(w));
		result.forEach(System.out::println);

		List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");

// Using Stream flatMap(Function mapper) 
		list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
		
		 // Creating a List of Strings 
        List<String> list22 = Arrays.asList("Geeks", "GFG", 
                                 "GeeksforGeeks", "gfg"); 
  
        // Using Stream flatMap(Function mapper) 
        list22.stream().map(str ->  
                         Stream.of(str.charAt(2))). 
                         forEach(System.out::println); 
	}

	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
			result.add(c);
		return result.stream();
	}
}

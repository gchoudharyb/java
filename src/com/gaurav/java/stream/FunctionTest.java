package com.gaurav.java.stream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> function = (str) -> str.length();
		System.out.println(function.apply("choudhary"));

		BiFunction<String, String, String> biFunction1 = (str1, sstr2) -> str1.concat(" ").concat(sstr2);
		Function<String, Integer> biFunction2 = ( sstr2) -> sstr2.length();
		
		System.out.println(biFunction1.andThen(biFunction2).apply("Gaurav", "Choudhary"));

	}
}

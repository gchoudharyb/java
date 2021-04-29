package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> function = (s)-> s.length();
		System.out.println(function.apply("Nucleus"));
		
		BiFunction<String, String, String> biFunction = (s1,s2)->s1+s2;
		System.out.println(biFunction.apply("gaurav", "choudhary"));
	}
}

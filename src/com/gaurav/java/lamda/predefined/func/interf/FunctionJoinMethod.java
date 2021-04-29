package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.Function;

public class FunctionJoinMethod {
	public static void main(String[] args) {
		Function<String, String> function1 = (s) -> s.toUpperCase();
		Function<String, String> function2 = (s) -> s.substring(0, 5);
		System.out.println(function1.andThen(function2).apply("Gaurav"));
		System.out.println(function2.compose(function1).apply("gaurav"));
		
		Function<Integer, Integer> function3 = (i) -> i=i+i;
		Function<Integer, Integer> function4 = (i) -> i*i;
		
		System.out.println(function3.andThen(function4).apply(10));
		System.err.println(function3.compose(function4).apply(10));
		
		Function<String,String> function = Function.identity();;
		
		System.out.println(function.apply("Inout"));

	}
}

package com.gaurav.java.functional.interf;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function<String, String> function1 = (i1)-> "number"+i1;
		Function<String, String> function2 = (i2)->  ""+i2+"found";
		System.out.println((function1.andThen(function2)).apply("200"));
		
		Function<Integer, String> function3 = (Integer i1)-> "number"+i1+"";
		Function<String, String> function4 = ( i2)->  ""+i2+"found";
		System.out.println((function3.andThen(function4)).apply(200));
		
		BiFunction<Integer, Integer, String> biFunction = (i1,i2)-> "addition"+i1+i2;
		
		System.out.println(biFunction.apply(100, 400));
	}
}

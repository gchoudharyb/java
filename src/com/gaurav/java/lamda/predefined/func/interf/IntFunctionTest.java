package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class IntFunctionTest {
public static void main(String[] args) {
	IntFunction<Integer> function = (i)-> 10*i;
	System.out.println(function.apply(500));
	
	ToIntFunction<String> function2 = (str)->str.length();
	System.out.println(function2.applyAsInt("Gaurav"));
}
}

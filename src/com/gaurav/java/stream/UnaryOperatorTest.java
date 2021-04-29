package com.gaurav.java.stream;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		UnaryOperator<String>  operator = (str)->str.concat(str);
		System.out.println(operator.apply("Hello"));
		
		BinaryOperator<String> binaryOperator = (str1,str2)->str1.concat(str2);
		System.out.println(binaryOperator.apply("Gaurav ", "Choudhary"));
	}
}

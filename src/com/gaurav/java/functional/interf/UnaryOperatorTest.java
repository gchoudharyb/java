package com.gaurav.java.functional.interf;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		UnaryOperator<String> operator = (s) -> s.concat("  hello");
		System.out.println(operator.apply("gaurav"));
	}
}

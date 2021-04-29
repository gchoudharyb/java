package com.gaurav.java.functional.interf;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperator<String> binaryOperator = (firstName, LastName) -> firstName.concat(" " + LastName);
		System.out.println(binaryOperator.apply("Gaurav", "Choudhary"));

		Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
		BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(comparator);
		System.out.println(binaryOperator2.apply(50, 100));

		BinaryOperator<Integer> binaryOperator3 = BinaryOperator.minBy(comparator);
		System.out.println(binaryOperator3.apply(450, 500));
	}
}

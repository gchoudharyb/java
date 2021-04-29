package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.IntPredicate;

public class IntPredicateTest {

public static void main(String[] args) {
	int[] input = {1,5,2,3,6,45,23,62,99};
	IntPredicate intPredicate = (i)->i%2!=0;
	for (int j : input) {
		System.out.println(j+"="+intPredicate.test(j));
	}
}
}

package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
public static void main(String[] args) {
	Integer input = 500;
	UnaryOperator<Integer> operator = (i)->i*i;
	System.out.println(operator.apply(input));
	
	BinaryOperator<String> binaryOperator = (str1,str2)-> str1+str2;
	System.out.println(binaryOperator.apply("gaurav", "Kumar"));
	
}
}

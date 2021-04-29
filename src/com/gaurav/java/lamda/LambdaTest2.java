package com.gaurav.java.lamda;

import java.util.Arrays;

public class LambdaTest2 {
public static void main(String[] args) {
	String [] strArr = new String[] {"as","dc"};
	Arrays.sort(strArr, String::compareToIgnoreCase);
}
}

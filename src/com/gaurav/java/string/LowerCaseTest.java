package com.gaurav.java.string;

public class LowerCaseTest {
	public static void main(String[] args) {
		String string = "gaurav";
		
		String string2 = string.toLowerCase();
		String string3 = string.toUpperCase();
		String string4 = string.toUpperCase();
		System.out.println(string==string2);
		System.out.println(string==string3);
		System.out.println(string==string4);
	}
}

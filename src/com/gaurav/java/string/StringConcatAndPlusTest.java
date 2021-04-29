package com.gaurav.java.string;

public class StringConcatAndPlusTest {
	public static void main(String[] args) {
		String str1 = "gaurav1";
		String str2 = "gaurav2";
		String concat = str1.concat(str2).concat("choudhary");
		System.out.println(concat);
		String x = str1+str2;
		System.out.println(x);
		System.out.println(concat==x);
		str1.concat("bbb"+null);
		
		String str3 = "kumar";
		String str4 = str3.concat("");
		String str6 = "kumarc";
		String str5 = str3.concat("c");
		String str7 = str3+"c";
		System.out.println(str3==str6);
		System.out.println(str6==str7);
	}
}

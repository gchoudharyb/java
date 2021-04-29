package com.gaurav.java.string;

public class StringEqualityCheck1 {
	public static void main(String[] args) {
		String str1 = "GauravKumarChoudhary";
		final String str2 = "Gaurav";
		final	String str3 = "Kumar";
		final	String str4 = "Choudhary";
		
		String str5 = str2+str3+str4;
		System.out.println(str1==str5);
		
		String str6 = str2.concat(str3).concat(str4);
		System.out.println(str1==str6);
		
		char [] s = {'g','a','u','r','a','v'};
		String s1 = new String(s);
		System.out.println(s1);
		
		byte [] b = {95,96,97,98,99,100,101};
		String string = new String(b);
		System.out.println(string);
		
		String replace = "Gaurav Kumar Choudhary";
		String sd = replace.replace(' ', '$');
		System.out.println(sd);
		String sc = replace.replaceAll("Ga", "ga");
		System.out.println(sc);
		
		String substring = "Gaurav Kumar Choudhary";
		String sub = substring.substring(1);
		System.out.println(sub);
		String sub1 = substring.substring(0,6);
		System.out.println(sub1);
		CharSequence  ccc=substring.subSequence(1, 5);
		System.out.println(ccc);
		
		System.out.println(substring.indexOf("a"));
		System.out.println(substring.lastIndexOf("a"));
		System.out.println(substring.lastIndexOf("X"));
		System.out.println(substring.indexOf("a",5));
		
		System.out.println(substring.endsWith("y"));
		
		System.out.println(substring.startsWith("K", 7));
		
	}
}

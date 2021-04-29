package com.gaurav.java.string;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("JAVA");
		s1.concat("IS");
		String s2 = s1.concat("MYTH");
		s1 = s1.concat("SOLUTIONS");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);

		byte[] b = { 100, 120, 100 };
		String s = new String(b);
		System.out.println(s);
		char[] c = { 'a', 'v', 'c', 'g' };
		String string = new String(c);
		System.out.println(string);

		String ss = "Gaurav";
		System.out.println(ss.charAt(3));

		System.out.println(ss.substring(2, 5));

		String stringCase1 = new String("gaurav");
		String stringCase2 = stringCase1.toUpperCase();
		String stringCase3 = stringCase1.toLowerCase();//Create new object in heap if content is changed for runtime object

		System.out.println(stringCase1 == stringCase2);
		System.out.println(stringCase1 == stringCase3);
		
		String stringCase4 = stringCase3.toUpperCase();
		System.out.println(stringCase2==stringCase4);
		
		stringCase4.intern();

	}
}

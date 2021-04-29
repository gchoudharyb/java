package com.gaurav.java.string;

public class StringBufferMethodTest {
public static void main(String[] args) {
	StringBuffer buffer = new StringBuffer("gaurav");
	System.out.println(buffer.capacity());
	System.out.println(buffer.charAt(2));
	buffer.setCharAt(0, 'f');
	System.out.println(buffer);
	buffer.append(false);
	System.out.println(buffer);
	buffer.insert(6, "Kumar");
	System.out.println(buffer);//fauravKumarfalse
	buffer.delete(2, 3);
	System.out.println(buffer);
	buffer.reverse();
	System.out.println(buffer);
	
	StringBuffer buffer1 = new StringBuffer("gaurav kumar choudhary");
	
	buffer1.setLength(6);
	System.out.println(buffer1);
	System.out.println(buffer1.capacity());
	buffer1.trimToSize();
	System.out.println(buffer1.capacity());
}}

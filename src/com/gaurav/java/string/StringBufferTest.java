package com.gaurav.java.string;

public class StringBufferTest {
public static void main(String[] args) {
	StringBuffer stringBuffer = new StringBuffer();
	stringBuffer.append("aaaasasasasasas");
	System.out.println(stringBuffer.capacity());
	
	
	StringBuffer s0 = new StringBuffer();
	s0.append("Hello ");
	System.out.println(s0);
	s0.insert(4, "Wrong");
	System.out.println(s0);
	
	
	StringBuffer s1 = new StringBuffer("Data_scinece");
	s1.delete(4,5);
	System.out.println(s1);
	s1.deleteCharAt(4);
	System.out.println(s1);
	
	
}
}

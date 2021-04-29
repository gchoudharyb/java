package com.gaurav.java.stream;

public interface Interface2 {
	void test();
	default void printMsg()
	{
		System.out.println("Interface1>>>>>>>printMsg");
	}
	static void showMsg()
	{
		System.out.println("Interface1>>>>>>>showMsg");
	}
}

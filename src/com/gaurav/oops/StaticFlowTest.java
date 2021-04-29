package com.gaurav.oops;

public class StaticFlowTest {
	
	public static void main(String[] args) {
		m1();
		m2();
	}
	static
	{
		m1();
	}
	static
	{
		m2();
	}
	public static void m2()
	{
		System.out.println(j);
	}
	static Integer i = 100;  // i=0 100
	static
	{
		m1();
	}
	public static void m1()
	{
		System.out.println(j);
	}
	
	
	static
	{
		System.out.println("2nd static block");
	}
	static Integer j = 200; //j=0 200
	
}
//i==100 j==100
//100 0
//100 0
//100 0
//2nd staticblock
//200
//200
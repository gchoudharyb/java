package com.gaurav.java.lamda;

@FunctionalInterface
public interface InterfFunc {

	public void implementMe();
	default public void message1() 
	{
		System.out.println("In default1");
	}
	default public void message(int i) 
	{
		System.out.println("In default2");
	}
	default public void message3() 
	{
		System.out.println("In default3");
	}
	default public void message1(String s) 
	{
		System.out.println("In default4");
	}
	
	static void staticMethod1()
	{
		System.out.println("In staticMethod1");
	}
	static void staticMethod1(String s)
	{
		System.out.println("In staticMethod12");
	}
}

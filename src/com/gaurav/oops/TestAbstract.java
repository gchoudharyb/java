package com.gaurav.oops;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class TestAbstract {
  String s1="50";
 String s2;
 String s3;
 String s4;
 String s5;
 String s6;
 String s7;
 String s8;
 public static void main(String[] args) throws FileNotFoundException {
		A a = new B();
		a.m2(10);;
	}
}
class TestAbs extends TestAbstract
{
	
	public TestAbs() {
		this.s1="60";
	}
}

class A 
{
	void m1() throws  FileNotFoundException
	{
		
	}
	void m2(int... q)
	{
		System.out.println("A");
	}
}
class B extends A
{
	void m1()
	{
		
	}
	
	}
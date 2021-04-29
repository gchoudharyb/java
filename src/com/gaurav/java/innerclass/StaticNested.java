package com.gaurav.java.innerclass;

import com.gaurav.java.innerclass.StaticNested.StaticTest;

public class StaticNested {
static class StaticTest
{
	public void m1() {
		System.out.println("Inner static");
	}
}
public static void main(String[] args) {
	StaticTest staticTest = new StaticTest();
	staticTest.m1();
	
}
}
class Testststs
{
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		staticTest.m1();
	}
}
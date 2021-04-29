package com.gaurav.oops;

public class Extends2 extends Extends1
{
	

	public void m2() {
		System.out.println("Extends2 m1");
	}

	public static void main(String[] args) {
		Extends2 extends2 = new Extends2();
		extends2.m1();
	}
}

 class Extends1  {
	public void m1() {
		System.out.println("Extends2");
		m2();
	}

	public void m2() {
		System.out.println("Extends2 m2");
	}
}

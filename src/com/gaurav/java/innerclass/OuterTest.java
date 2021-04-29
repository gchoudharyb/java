package com.gaurav.java.innerclass;

public class OuterTest {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();
	}
}


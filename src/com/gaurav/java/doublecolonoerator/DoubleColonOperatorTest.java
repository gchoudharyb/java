package com.gaurav.java.doublecolonoerator;

import com.gaurav.java.var_args.Test;

public class DoubleColonOperatorTest {
public static void main(String[] args) {
	Interf4 interf4 = DoubleColonOperatorTest::m2;
	interf4.m1();
}
public static void m2() {
	System.out.println("In m2 method");
}
}
interface Interf4
{
	public void m1();
}
class TEstr
{
	void m3() {
		Interf4 interf4 = DoubleColonOperatorTest()::m2;
	}
}
package com.gaurav.oops;

public class OverloadingTestPrimitive {
public void m1(byte b)
{
	System.out.println("byte");
}
public void m1(short b)
{
	System.out.println("short");
}
public void m1(int b)
{
	System.out.println("int");
}
public void m1(long b)
{
	System.out.println("long");
}
public void m1(float b)
{
	System.out.println("float");
}
public void m1(double b)
{
	System.out.println("double");
}
public static void main(String[] args) {
	OverloadingTestPrimitive overloadingTestPrimitive = new OverloadingTestPrimitive();
	overloadingTestPrimitive.m1((byte)10);
}
}

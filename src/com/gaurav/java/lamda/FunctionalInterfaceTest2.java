package com.gaurav.java.lamda;

@FunctionalInterface
public interface FunctionalInterfaceTest2 {
int getMessage(int a,int b);
default void m1() 
{
	System.out.println("In Default method");
}
static void m2()
{
	System.out.println("In static method");
}
}

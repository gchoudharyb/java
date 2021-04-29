package com.gaurav.java.lamda;

@FunctionalInterface
public interface FunctionalInterfaceTest {
void getMessage();
default void m1() 
{
	System.out.println("In Default method");
}
static void m2()
{
	System.out.println("In static method");
}
}

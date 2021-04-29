package com.gaurav.oops;

public class OverrideTest extends ParentT {

	static int getMessage2() {
		// TODO Auto-generated method stub
		//super.getMessage2();
	}
	static int m1() {
		return 0
	}
}
class ParentT extends Object
{
	void getMessage2() 
	{
		System.out.println("In Parent getMessage2()");
	}
	
	void m1(int s , float d)
	{
		
	}
	void m1(float s , int d)
	{
		
	}
}
package com.gaurav.oops;

public class OverLoadingTest {
	public static void main(String[] args) {
		OverLoadingTest1  loadingTest1 = new OverLoadingTest1();
		loadingTest1.m2(5,5);
		 int a = 10; 
	        int b = ++a;
	        b=a++;
	        
	        int x = (a++);
	}
}
class OverLoadingTest1
{
	public void m1(String s)
	{
		
	}
	public void m1(StringBuffer s)
	{
		
	}
	
	public void m2(int i , float f)
	{
		
	}
	public void m2( float f,int i)
	{
		
	}
	public void m3(int...is)
	{
		
	}
	public void m3(int[] is)
	{
		
	}
	
}
class OverLoadingTest2
{
}
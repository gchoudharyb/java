package com.gaurav.java.innerclass;

public class MethodLocalInnerClass {

	public void sum()
	{
		class Sum
		{
			public int sum(int a,int b)
			{
				return a+b;
			}
		}
		Sum sum = new Sum();
		sum.sum(10, 1);
		sum.sum(100, 10);	
		sum.sum(100, 120);	
	}
}

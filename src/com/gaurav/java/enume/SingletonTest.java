package com.gaurav.java.enume;

public class SingletonTest {
	private SingletonTest() {
	}
	
	private static final SingletonTest SINGLETON_TEST = null;
	/*public static SingletonTest getSingletonTestInstance() 
	{
		return SINGLETON_TEST;
	}*/
	
	
	public static  SingletonTest getSingletonTestInstance1() 
	{
		
		
		if(null!=SINGLETON_TEST)
		{
			return SINGLETON_TEST;
		}
		else
		{
			return new SingletonTest();
		}
		
	}
}

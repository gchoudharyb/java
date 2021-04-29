package com.gaurav.java.nativee;

public class Native {

	static
	{
		System.loadLibrary("");
	}
	public  native void m1();
	
}

class Test
{
	private String nsme;
	public static void main(String[] args) {
		Native native1 = new Native();
		native1.m1();
	}
	
	
}
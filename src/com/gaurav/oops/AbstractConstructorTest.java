package com.gaurav.oops;

public abstract class AbstractConstructorTest {

	private AbstractConstructorTest(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8) {
		//super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
		this.a7 = a7;
		this.a8 = a8;
	}

	public int a1;
	public int a2;
	public int a3;
	
	public int a4;
	public int a5;
	public int a6;
	public int a7;
	
	public int a8;
	
	public abstract void getMessage1();
	
}

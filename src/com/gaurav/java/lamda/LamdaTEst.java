package com.gaurav.java.lamda;

public class LamdaTEst {
	int x = 800;
public static void main(String[] args) {
	new LamdaTEst().mt();
}
void mt() 
{
	Interf interf = ()-> 
	{
		int x =500;
		System.out.println(this.x);
	};
	interf.m2();
	}
}
interface Interf
{
	void m2();
}
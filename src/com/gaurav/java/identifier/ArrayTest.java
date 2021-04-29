package com.gaurav.java.identifier;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayTest {
public static void main(String[] args) {
	//int [] []a,[]b;
	int y =  (10);
	int x = y++;
	System.out.println(x);
	System.out.println(y);
	
	byte b = 10;
	//b = b+1;
	++b;
	System.out.println(b);
	//System.out.println(10/0);
	System.out.println(0.0/0);
	System.out.println(0/0.0);
	System.out.println(10/0.0);
	
	System.out.println(10<20);
	
	String string  = new String();
	Thread thread = new Thread();
	System.out.println(string==thread);
}
}

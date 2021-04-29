package com.gaurav.java.operators;

 class Test1 {
protected static void main(String[] args) {
	byte a = 100;
	byte b = 10;
	byte c = (byte) (a+b);//max(int,type of a,type of b) = max(int,byte,byte)
	
	double a1 = 452.02;
	double a2 = 42252.02;
	double a3 = a1+a2;
	
	char c1 = 50;
	char c2 = 62;
	
	char c3 =  (char) (c1+c2);
	
	
	System.out.println(c);
	System.out.println(a3);
	System.out.println(c3);
	
	byte a5 = 100;
	byte b5 = 10;
	byte c5 = 10;
	byte c6 = (byte) (a5+b5+c5);
	
	//System.out.println(10/0);
	System.out.println(-10/0.0); //Infinity
	//System.out.println(0/0.0); //Nan
	//System.out.println(0/0);
	
	System.out.println(10<12);
	System.out.println(10==Float.NaN);
	System.out.println(10!=Float.NaN);
	System.out.println(Float.NaN==Float.NaN);
	
	String s1 = new String("gaurav");
	String s2 = new String("gaurav");
	System.out.println(s1==s2);
	System.out.println(s1.intern()==s2.intern());
	System.out.println(s1.intern()==s2);
	System.out.println(null==null);
	
	Thread t1 = new Thread();
	
	
	
//	System.out.println(t1 instanceof String);/Incompatible conditional operand types Thread and String
	
	System.out.println(true & false);
	System.out.println(true | false);
	System.out.println(true ^ false);
	System.out.println(true ^ true);
	
	System.out.println("_______________________________________________");
	
	System.out.println(4 & 5);
	System.out.println(4 | 5);
	System.out.println(4 ^ 5);
	
System.out.println("_______________________________________________");
	
	System.out.println(~4);
	System.out.println(~-54);
	//System.out.println(~true);
	
	//System.out.println(!5);
	System.out.println(!true);
	
	try {
		Object o = Class.forName("Test1").newInstance();
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	while(true)
	{
		System.out.println();
	}
	//System.out.println();
}
}

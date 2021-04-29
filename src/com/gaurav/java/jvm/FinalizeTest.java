package com.gaurav.java.jvm;

import javax.management.relation.RoleList;

public class FinalizeTest {
	public static void main(String[] args) throws InterruptedException {
		GC gc = new GC();
		GC gc1 = new GC();
		GC gc2 = new GC();
		gc.test();
		System.gc();
		gc=null;
		gc1=null;
		gc2=null;
		
		{
			GC gc5 = new GC();
			gc5 = null;
		}
		
		
		RoleList
		/*for(int i =0;i<1000000;i++)
	    {
			GC gc5 = new GC();
	        gc5 = null;
	    }*/
		//
	}
}

 class GC

{

	@Override
	public void finalize() throws Throwable {
		System.out.println("In Finalize method");
	}
	
	void test()
	{
		System.out.println("hello");
	}
}
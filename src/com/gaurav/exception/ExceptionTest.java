package com.gaurav.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {
public static void main(String[] args) {
	ExceptionTest t=new ExceptionTest();
	try {
		
		t.check();
	} catch (Exception e) {
		System.out.println("catch bli 1");
	}
	
	
}
void check() throws Exception
{
	try {
		throw new IOException();
	} catch (IOException e) {
		System.out.println("catch block 2");
		throw new Exception();
	}
	 catch (Exception e) {
		 System.out.println("catch block 3");
		}
	finally {
		 System.out.println("catch finally 3");
	}

}
}

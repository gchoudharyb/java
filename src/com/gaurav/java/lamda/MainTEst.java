package com.gaurav.java.lamda;

public class MainTEst {
public static void main(String[] args) {
	FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest() {
		
		@Override
		public void getMessage() {
			// TODO Auto-generated method stub
			
		}
	};
	
	FunctionalInterfaceTest functionalInterfaceTest2 = ()->System.out.println("In get Message");
	functionalInterfaceTest2.getMessage();
	
	
	functionalInterfaceTest.m1();
	FunctionalInterfaceTest.m2();
	
	FunctionalInterfaceTest2 functionalInterfaceTest22 = (a,b)-> {return (a+b);};
	System.out.println(functionalInterfaceTest22.getMessage(200, 400));
	
	
}
}

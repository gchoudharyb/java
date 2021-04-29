package com.gaurav.java.stream;

public class InterfaceTest implements Interface1,Interface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printMsg() {
		System.out.println("In implementation class");;
	}
	
	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		Interface1 interface1 = new InterfaceTest();
		interface1.printMsg();
		interfaceTest.printMsg();
	}

}

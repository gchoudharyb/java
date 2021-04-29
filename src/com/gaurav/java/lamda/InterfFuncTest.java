package com.gaurav.java.lamda;

public class InterfFuncTest implements InterfFunc {

	@Override
	public void implementMe() {
		// TODO Auto-generated method stub
		
	}
@Override
public void message(int i) {
	System.out.println("Child");
}
public static void main(String[] args) {
	InterfFuncTest interfFuncTest = new InterfFuncTest();
	interfFuncTest.message(10);
	InterfFunc interfFunc = new InterfFuncTest();
	interfFunc.message(300);
}
}

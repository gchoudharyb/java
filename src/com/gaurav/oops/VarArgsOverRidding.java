package com.gaurav.oops;

public class VarArgsOverRidding {
	public static void main(String[] args) {
		VarArgsOverRiddingBean argsOverRidding = new VarArgsOverRiddingBeanChild();
		argsOverRidding.m1(10);
	}
}

class VarArgsOverRiddingBean {
	 void m1(int... x) {
		System.out.println("void m1(int x)");
	}
}

class VarArgsOverRiddingBeanChild extends VarArgsOverRiddingBean {
	void m1(int x) {
		System.out.println("void m1(int... x)");
	}
	@Override
	void m1(int... x) {
		System.out.println("Child");
	}
}
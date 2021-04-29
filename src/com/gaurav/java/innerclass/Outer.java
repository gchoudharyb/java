package com.gaurav.java.innerclass;

class Outer {
	int x = 10;
	static int y =20;
	class Inner {
		int x = 1000;
		public void m1() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(Outer.this.x);
			System.out.println("In method m1");
		}
		public void m2() {
			System.out.println("In method m2");
			m1();
			m3();
		}
		
	}
	public void m3() {
		Inner inner = new Inner();
		inner.m1();
	}
	public static void main(String[] args) {
		System.out.println("Outer");
		Outer outer = new Outer();
		Outer.Inner inner2 = outer.new Inner();
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();
		

	}
}


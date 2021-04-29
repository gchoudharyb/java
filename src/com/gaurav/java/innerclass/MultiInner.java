package com.gaurav.java.innerclass;

public class MultiInner {
	public static void main(String[] args) {
		
		A.B.C.D name = new A().new B().new C().new D();
		name.m1();
	}
}
class ww
{
	int x=0;
	static int ii=2;
	void m1()
	{
		class gg
		{
			void ff()
			{
				System.out.println(x);
				System.out.println(ii);
			}
		}
	}
}

class A
{
	class B
	{
		class C
		{
			
			class D
			{
				public void m1()
				{
					System.out.println("This is m1()");
				}
			}
		}
	}
}
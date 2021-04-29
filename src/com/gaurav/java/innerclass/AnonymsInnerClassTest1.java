package com.gaurav.java.innerclass;

public class AnonymsInnerClassTest1 {
public static void main(String[] args) {
	Popcorn popcorn = new Popcorn()
	{
		@Override
		public void test() {
			System.out.println("salty");
		}
	};
	popcorn.test();
}
}
class Popcorn
{
	public void test() 
	{
		System.out.println("No Tast");
	}
}
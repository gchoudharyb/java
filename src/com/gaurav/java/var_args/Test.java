package com.gaurav.java.var_args;

public class Test {

	
	public static int sum(int...input)
	{
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}
	
	/*public static int sum(int[] input)
	{
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}*/
	
	public static final synchronized strictfp void main(String... args) {
		System.out.println(sum(10,20,300));
		sum(new int[] {10});
	}
}

package com.gaurav.java.functional.interf;

import java.util.function.Supplier;

public class EffectiveFinalTest {
public static void main(String[] args) {
	int i=0;
	Supplier<Integer> supplier = ()->
	{
		//i=50; //we can't reasign value under lamda
		return 100;
	
	};
	i=50;
	
}
}

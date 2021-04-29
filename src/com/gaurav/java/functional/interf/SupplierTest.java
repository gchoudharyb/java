package com.gaurav.java.functional.interf;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Integer> supplier = ()-> {return 100;};
		
		System.out.println(supplier.get());
		
	}
}

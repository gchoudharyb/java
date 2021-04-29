package com.gaurav.java.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> supplier = ()-> "Welcome you";
		System.out.println(supplier.get());
		
		UnaryOperator<String> function = String::toUpperCase;
		
		Consumer<String> consumer = System.out::print;
		
	}
}

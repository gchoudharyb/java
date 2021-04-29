package com.gaurav.java.lamda;

public interface Interface2 {
	default void getMessage() {
		System.out.println("In Interface1 method");
	}
}

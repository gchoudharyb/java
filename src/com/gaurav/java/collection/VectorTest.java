package com.gaurav.java.collection;

import java.util.Vector;

public class VectorTest {
public static void main(String[] args) {
	Vector< Integer> integers = new Vector<>();
	integers.add(12);
	System.out.println(integers);
	
	Vector<Integer> integers2 = new Vector<>(20, 2);
	integers2.addElement(20);
	integers2.add(0, 10);
	integers2.add(1, 10);
	integers2.add(2, 10);
	System.out.println(integers2);
	
	for (Integer integer : integers2) {
		
	}
	
}
}

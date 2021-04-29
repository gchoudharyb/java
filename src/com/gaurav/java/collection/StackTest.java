package com.gaurav.java.collection;

import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	Stack<Integer> integers = new Stack<>();
	integers.push(50);
	integers.push(51);
	System.out.println(integers);
	System.out.println(integers.peek());
	System.out.println(integers);
}
}

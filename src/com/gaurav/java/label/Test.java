package com.gaurav.java.label;

 class Test {
public static void main(String[] args) {
	l1: for (int i = 0; i < args.length; i++) {
		String string = args[i];
	l2:	for (int j = 0; j < args.length; j++) {
			String string1 = args[j];
			l3: for (String string2 : args) {
				break l2;
			}
		}
	}
}
}

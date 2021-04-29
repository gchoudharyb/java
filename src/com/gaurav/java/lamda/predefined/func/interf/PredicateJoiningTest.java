package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.Predicate;

public class PredicateJoiningTest {
public static void main(String[] args) {
	int [] arr = {0,5,10,20,15,25,30,56,1,99,88,77};
	Predicate<Integer> predicate1 = (num)->num>10;
	Predicate<Integer> predicate2 = (num)->num%2==0;
	System.out.print("There number greater that 10 are::");
	m1(predicate1, arr);
	System.out.print("There even numers are::");
	m1(predicate2, arr);
	System.out.print("There numers which is not gretaer than 10::");
	m1(predicate2.negate(), arr);
	System.out.print("There numers which is  gretaer than 10 and also even ::");
	m1(predicate2.and(predicate1), arr);
	System.out.print("There numers which is  gretaer than 10 or  even ::");
	m1(predicate2.or(predicate1), arr);
}
public static void m1(Predicate<Integer> predicate,int [] arr) {
	for (int i : arr) {
		if (predicate.test(i)) {
			System.err.print(i);
		}
		
	}
	
	System.out.println();
}
}

package com.gaurav.java.functional.interf;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	Predicate<Integer> predicate = (i)->i%2==0;
	Predicate<Integer> predicate2 = (i)->i%8==0;
	System.out.println(predicate.test(15));
	
	System.out.println("And test::"+predicate.and(predicate2).test(16));
	System.out.println("Or test::"+predicate.or(predicate2).test(16));
	System.out.println("And test::"+predicate.and(predicate2).test(2));
	System.out.println("Or test::"+predicate.or(predicate2).test(2));
	System.out.println("Or test::"+predicate2.negate().test(8));
	
	BiPredicate<Integer,Integer> biPredicate = (i1,i2)->i1==i2;
	System.out.println(biPredicate.test(10, 12));
	System.out.println(biPredicate.test(100, 100));
}
}

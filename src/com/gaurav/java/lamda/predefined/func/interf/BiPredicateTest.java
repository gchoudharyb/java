package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> {
			if (i1 == i2) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(biPredicate.test(100, 100));
		System.out.println(biPredicate.test(258, 258));
		
		BiFunction<String, String, Boolean> biFunction=  (str1,str2)->
		{
			return str2.equalsIgnoreCase(str1);
		};
		System.out.println(biFunction.apply("Gaurav", "Gaurav"));
		
		BiConsumer<String, Integer> biConsumer = (str1,i)-> System.out.println(str1+" having marks::"+i);
		biConsumer.accept("gaurav", 100);
	}
}

package com.gaurav.java.functional.interf;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1,0,1,2,5,1,3,5,8,9,1,0,3,6,6,5,8);
	
	
	
	Consumer<Integer> c1 = (i)->System.out.println(i*i);
	Consumer<Integer> c2 = (i1)-> System.out.println("HI");
	
	integers.forEach(c1.andThen(c2));
	
	Consumer<String> c4 = (System.out::println);
	
	BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a*b);
	biConsumer.accept(100, 100);	
}
}

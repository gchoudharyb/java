package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest3 {
	public static void main(String[] args) {
		Consumer<Integer> printSqrConsumer = (i)-> System.out.println(i*i);
		
		printSqrConsumer.accept(10);
		
		BiConsumer<Integer, String> rankBiConsumer = (rank,name) -> System.out.println("Rank Of "+name+" is "+rank);
		
		rankBiConsumer.accept(1, "gaurav");
		
		
		List<Strudent> list = new ArrayList<Strudent>();
		Strudent strudent1 = new Strudent("Gaurav", 500);
		Strudent strudent2 = new Strudent("Gaurav", 400);
		Strudent strudent3 = new Strudent("Gaurav", 300);
		Strudent strudent4 = new Strudent("Gaurav", 100);
		list.add(strudent1);
		list.add(strudent2);
		list.add(strudent3);
		list.add(strudent4);
		Consumer<Strudent> consumer = System.out::println;
		list.forEach(consumer);
	}
}

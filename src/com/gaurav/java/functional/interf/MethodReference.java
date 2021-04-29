package com.gaurav.java.functional.interf;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.print.DocFlavor.STRING;

public class MethodReference {
	public static void main(String[] args) {
		Function<String, String> function = (s)->s.toLowerCase(Locale.ENGLISH);
		Function<String, String> function1 = String::toLowerCase;
		
		Consumer<Integer> consumer1 = (i) ->System.out.println(i);
		Consumer<Integer> consumer2 = System.out::println;
		
		consumer1.accept(20);
		consumer2.accept(200);
		
		System.out.println(function.apply("GAua"));
		System.out.println(function1.apply("ZZcGAua"));
		
		Supplier<Student> supplier = () -> new Student();
		
		Supplier<Student> supplier2 = Student::new;
		
		Student student = supplier2.get();
		
	}
}

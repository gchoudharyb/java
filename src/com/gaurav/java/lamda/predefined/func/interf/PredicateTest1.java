package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest1 {
public static void main(String[] args) {
	Predicate<String> predicate = (s)-> s.equals("Gaurav");
	System.out.println(predicate.test("Gaurav"));
	System.out.println(predicate.test("gaurav"));
	
	Predicate<Collection<String>> predicate2 = (list)->list.isEmpty();
	List<String> list = new ArrayList<String>();
	list.add("gaurav");
	list.add("gaurav");
	list.add("gaurav");
	System.out.println(predicate2.test(list));
	List<String> list1 = new ArrayList<String>();
	System.out.println(predicate2.test(list1));
	
}

}

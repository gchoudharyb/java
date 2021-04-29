package com.gaurav.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndAnyTest {
public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1,2,3,5,7,6,9,4,2,1,3,5,6,5,1,0,8,9,100,1000,5,25,125);
	Optional<Integer> optional = integers.stream().filter((i) -> i%3==0).findAny();
	if(optional.isPresent())
	{
		System.out.println(optional.get());
	}
	else
	{
		System.out.println("Not Found");
	}
	
	Optional<Integer> optional1 = integers.stream().filter((i) -> i%3==0).findAny();
	if(optional1.isPresent())
	{
		System.out.println(optional1.get());
	}
	else
	{
		System.out.println("Not Found");
	}
}
}

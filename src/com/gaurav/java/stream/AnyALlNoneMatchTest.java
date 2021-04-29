package com.gaurav.java.stream;

import java.util.Arrays;

public class AnyALlNoneMatchTest {
	public static void main(String[] args) {
		System.out.println(Arrays.stream(new String[] {"gaurav","kumar","choudhary"}).allMatch((s)->s.startsWith("g")));
		System.out.println(Arrays.stream(new String[] {"gaurav","kumar","choudhary"}).anyMatch((s)->s.startsWith("g")));
		System.out.println(Arrays.stream(new String[] {"gaurav","kumar","choudhary"}).noneMatch((s)->s.startsWith("g")));
	}
}

package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.Function;

public class RemoveSpaceUsingFunction {
public static void main(String[] args) {
	String str = "ga gagsa";
	Function<String, String> function = (s)->s.replaceAll(" ", "");
	Function<String, Integer> function2 = (s) -> s.length()-s.replaceAll(" ","").length();
	System.out.println(function.apply(str));
	System.out.println(function2.apply("Ga ura v"));
}
}

package com.gaurav.java.lamda.predefined.func.interf;

import java.util.function.Consumer;

public class ConsumerTest {
public static void main(String[] args) {
	Consumer<String> consumer = (s)->System.out.println(s);
	consumer.accept("gaurav");
	consumer.accept("Choudhary");
}
}

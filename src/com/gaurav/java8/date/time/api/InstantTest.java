package com.gaurav.java8.date.time.api;

import java.time.Instant;

public class InstantTest {
public static void main(String[] args) {
	Instant instant = Instant.now();
	System.out.println(instant);
	System.out.println(instant.getEpochSecond());
}
}

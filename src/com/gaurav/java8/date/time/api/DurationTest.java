package com.gaurav.java8.date.time.api;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DurationTest {
public static void main(String[] args) {
	Duration duration = Duration.of(4, ChronoUnit.HOURS);
	System.out.println();
	LocalTime localTime = LocalTime.now();
	LocalTime localTime2 = LocalTime.of(12, 30);
	
	System.out.println(localTime.until(localTime2, ChronoUnit.HOURS));
}
}

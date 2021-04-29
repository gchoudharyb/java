package com.gaurav.java8.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;

public class LocalDateTest {
public static void main(String[] args) {
	
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime);
	
	System.out.println(localDateTime.getDayOfMonth());
	System.out.println(localDateTime.getDayOfYear());
	System.out.println(localDateTime.getHour());
	System.out.println(localDateTime.getMinute());
	
	System.out.println(localDate.withYear((1990)));
	//localDate.minus(TemporalAdjusters.lastDayOfYear());
	
	LocalTime localTime2 = LocalTime.of(01, 12, 13);
	System.out.println(localTime2);
	
	LocalTime localTime3 = LocalTime.of(13, 28, 29);
	System.out.println(localTime3);
}
}

package com.gaurav.java.joda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;

public class LocaDateTest1 {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println(dateTime);
	
	LocalDate date2 = LocalDate.of(1990, 8, 7);
	LocalDate dateNow = LocalDate.now();
	Period period = Period.between(date2, dateNow);
	System.out.println(period);
	
	Year year = Year.of(1500);
	System.out.println(year.isLeap());
}
}

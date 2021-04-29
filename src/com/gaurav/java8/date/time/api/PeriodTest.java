package com.gaurav.java8.date.time.api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
	public static void main(String[] args) {
		Period period = Period.of(1990, 02, 30);
		System.out.println(period);
		LocalDate date = LocalDate.of(1999, 02, 25);
		LocalDate date2 = LocalDate.now();
		System.out.println(date.until(date2));
		
		Period period2 = date.until(date2);
		System.out.println(period2.getDays());
		System.out.println(period2.getMonths());
		System.out.println(period2.getYears());
		
	}
}

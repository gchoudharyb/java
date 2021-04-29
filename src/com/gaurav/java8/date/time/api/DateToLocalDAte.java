package com.gaurav.java8.date.time.api;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDAte {
public static void main(String[] args) {
	Date date = new Date();
	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	System.out.println(localDate);
}
}

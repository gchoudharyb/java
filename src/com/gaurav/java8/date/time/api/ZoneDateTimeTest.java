package com.gaurav.java8.date.time.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {
public static void main(String[] args) {
	ZonedDateTime dateTime = ZonedDateTime.now()
			;
	System.out.println(dateTime.getOffset());
	System.out.println(dateTime.getZone());
	System.out.println(ZoneId.getAvailableZoneIds());
}
}

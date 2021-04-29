package com.gaurav.java.joda;

import java.time.ZoneId;
import java.util.Set;

public class ZoneTest {
public static void main(String[] args) {
	ZoneId id = ZoneId.systemDefault();
	System.out.println(id);
	Set<String> zoneId = ZoneId.getAvailableZoneIds();
	System.out.println(zoneId);
}
}

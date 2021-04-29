package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
	public static void main(String[] args) {
		Address address1 = new Address(1, "Noida", "62");
		Address address2 = new Address(2, "Noida", "63");
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		Employee employee1 = new Employee(1, "Gaurav", addresses); 
		Employee employee2 = new Employee(2, "Gaurav1", addresses);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		List<List<Address>> addresses2 = employees.stream().map(Employee::getEmployeeAddress).collect(Collectors.toList());
		System.out.println(addresses2);
		ArrayList<Address> addresses3 = (ArrayList<Address>) employees.stream().map(Employee::getEmployeeAddress).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(addresses3);
		
		 
		
	}
}

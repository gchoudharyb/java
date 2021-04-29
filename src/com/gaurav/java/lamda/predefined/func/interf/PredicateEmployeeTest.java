package com.gaurav.java.lamda.predefined.func.interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("15220", "Gaurav kumar", "SE", 75000, "SSE");
		Employee employee2 = new Employee("15221", "kaurav kumar", "ASE", 5000, "SSSE");
		Employee employee3 = new Employee("15222", "aaurav kumar", "ASSE", 15000, "SSSSE");
		Employee employee4 = new Employee("15223", "xaurav kumar", "TSSE", 25000, "ASSSE");
		Employee employee5 = new Employee("15224", "maurav kumar", "TL", 65000, "SSE");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		System.out.println(employees);
		Predicate<Employee> predicate = (e)->e.getRole().equalsIgnoreCase("SSE");
		display(predicate, employees);
		
		Predicate<String> predicate2 = Predicate.isEqual("Gaurav");
		System.out.println(predicate2.test("gaurav"));
		System.out.println(predicate2.test("False"));
	}

	public static void display(Predicate<Employee> predicate, List<Employee> employees) {
		for (Employee employee : employees) {
			if(predicate.test(employee))
			{
				System.out.println(employee.getEmpName()+" is manager");
			}
		}
	}
}

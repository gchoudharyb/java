package com.gaurav.java.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("gaurav");
	list.add("kumar");
	list.add("Choudhary");
	Collections.sort(list);
	
	System.out.println(list);
	
	list.add("abc");
	list.add("Tejaswini");
	Collections.sort(list, ( str1, str2)-> str2.compareTo(str1));
	System.out.println(list);
	
	List<Emp> emps = new ArrayList<>();
	emps.add(new Emp("1", "gaurav"));
	emps.add(new Emp("10", "kumar"));
	emps.add(new Emp("6", "choudhary"));
	emps.add(new Emp("103", "tejaswini"));
	emps.add(new Emp("100", "Ramdasji"));
	
	Collections.sort(emps, (e1,e2)-> e2.getEmpId().compareTo(e1.getEmpId()));
	System.out.println(emps);
}
}
class Emp
{
	String empId;
	String empName;
	
	public Emp(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
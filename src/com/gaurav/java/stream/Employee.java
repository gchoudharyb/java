package com.gaurav.java.stream;

import java.util.List;

public class Employee {
private Integer employeeId;
private String employeeName;
private List<Address> employeeAddress;


public Employee(Integer employeeId, String employeeName, List<Address> employeeAddress) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
}
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public List<Address> getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(List<Address> employeeAddress) {
	this.employeeAddress = employeeAddress;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
			+ employeeAddress + "]";
}

}

package com.gaurav.java.collection;

public class Address implements Comparable<Address>{
private String studentId;
private String studentAddress;

public Address() {
	// TODO Auto-generated constructor stub
}

public Address(String studentId, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentAddress = studentAddress;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
@Override
public String toString() {
	return "Address [studentId=" + studentId + ", studentAddress=" + studentAddress + "]";
}

@Override
public int compareTo(Address o) {
	return this.studentAddress.compareTo(o.getStudentAddress());
}

}

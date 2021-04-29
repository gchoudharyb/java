package com.gaurav.java.lamda.predefined.func.interf;

public class Strudent {
private String studentName;
private Integer studentMarks;
public Strudent(String studentName, Integer studentMarks) {
	super();
	this.studentName = studentName;
	this.studentMarks = studentMarks;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Integer getStudentMarks() {
	return studentMarks;
}
public void setStudentMarks(Integer studentMarks) {
	this.studentMarks = studentMarks;
}
@Override
public String toString() {
	return "Strudent [studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
}

}

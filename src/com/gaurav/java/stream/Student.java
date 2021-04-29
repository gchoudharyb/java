package com.gaurav.java.stream;

public class Student implements Comparable<Student> {
	private Integer studentId;
	private String grade;
	private String studentName;

	public Student(Integer studentId, String grade, String studentName) {
		super();
		this.studentId = studentId;
		this.grade = grade;
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", grade=" + grade + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStudentId()-o.getStudentId();
	}

}

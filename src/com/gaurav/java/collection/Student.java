package com.gaurav.java.collection;

public class Student implements Comparable<Student> {
	private int roll_no;
	private String studentName;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int rollNo, String studentName) {
		this.roll_no = rollNo;
		this.studentName = studentName;
	}
@Override
protected void finalize() throws Throwable {
	System.out.println("Finalize method called");
}

@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", studentName=" + studentName + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + roll_no;
	result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (roll_no != other.roll_no)
		return false;
	return true;
}

@Override
public int compareTo(Student o) {
	return this.getRoll_no()-o.getRoll_no();
}

}

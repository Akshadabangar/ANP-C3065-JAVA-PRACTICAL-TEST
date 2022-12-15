package org.hitech.model;

import java.util.Objects;

public class Student {
//member variables
	int studentID;
	String studentName;
	String qualification;

	public Student() // Non-Parameterized Constructor
	{

	}

	public Student(int studentId, String studentName, String qualification, int studentID) // Parameterized Constructor
	{
		this.studentID = studentID;
		this.studentName = studentName;
		this.qualification = qualification;
	}

//setter method
	public void setstudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setqualification(String qualification) {
		this.qualification = qualification;
	}

//getter method
	public int getstudentID() {
		return studentID;
	}

	public String getstudentName() {
		return studentName;
	}

	public String getqualification() {
		return qualification;
	}

	@Override
	public String toString() {
		return "Student[studentID-" + studentID + ",studentName-" + studentName + ",qualification-" + qualification
				+ "]";
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
		return Objects.equals(qualification, other.qualification) && studentID == other.studentID
				&& Objects.equals(studentName, other.studentName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(qualification, studentID, studentName);
	}
}

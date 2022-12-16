package org.hitech.view;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

import org.hitech.model.Student;
import org.hitech.model.Course;
import org.hitech.service.Student_Course_Service;
public class Student_Course_View 
{
private Student_Course_Service scService=new Student_Course_Service();
	
	public void addStudentCourseDetails() {
		Scanner sc=new Scanner(System.in);
		
		int sID;
		System.out.println("Enter the Student ID : ");
		sID=sc.nextInt();
		
		String sName;
		System.out.println("Enter the Student Name : ");
		sName=sc.next();
		
		String qualification;
		System.out.println("Enter the Student Qualification : ");
		qualification=sc.next();
		
		
		int cID;
		System.out.println("Enter the Course ID : ");
		cID=sc.nextInt();
		
		String cName;
		System.out.println("Enter the Course Name : ");
		cName=sc.next();
		
		double price;
		System.out.println("Enter the Course Price : ");
		price=sc.nextInt();
		
		
		
		
		Student s=new Student(studentID, studentName, qualification, studentID);
		Course c=new Course(courseID, courseName, price);
		scService.addStudentCourseDetails(s, c);
		scService.deleteStudentCourseDetails(s);
		}
	
	
	
	
	
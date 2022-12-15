package org.hitech.model;

import java.util.Objects;

public class Course 
{
		 int courseID;
		 String courseName;
		 double price;
		 
		 public Course() //Non-Parameterized Constructor
		 {
		 	
		 }
		 public Course(int courseId,String courseName, double price, int courseID) //Parameterized Constructor
		 {
		 	this.courseID=courseID;
		 	this.courseName=courseName;
		 	this.price=price;
		 }
		 //Setter
		 public void setcourseID(int courseID)
		 {
		 	this.courseID=courseID;
		 }
		 public void setcourseName(String courseName)
		 {
		 	this.courseName=courseName;
		 }
		 public void setprice(double price)
		 {
		 	this.price=price;
		 }
		 
		 //getter
		 public int getcourseID()
		 {
			 return courseID;
			 
		 }
		 public String getcourseName()
		 {
			 return courseName;
			 
		 }
		 public double getPrice()
		 {
			 return  price;
		 }
		 
		
		 @Override
		 public String toString()
		 {
			 return "course[courseID-"+courseID+",courseName-"+courseName+",price-"+price+"]";	
		 }
		  
		  @Override
		  public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Course other = (Course) obj;
				return courseID == other.courseID && Objects.equals(courseName, other.courseName)
						&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
			}
		  @Override
		  public int hashCode()
		  {
			  return Objects.hash(courseID, courseName, price);
		  } 
		  }
	   
		  
	



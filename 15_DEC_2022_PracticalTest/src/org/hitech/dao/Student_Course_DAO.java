package org.hitech.dao;
import org.hitech.model.*;
import java.util.*;

public class Student_Course_DAO 
{

		public static HashMap<Student,Course> hashmap=new HashMap<Student,Course>();
		public void addStudentCourseDetails(Student s,Course c) {
			hashmap.put(s,c);
		}
		public HashMap<Student, Course>getStudentCourseDetails(){
			return hashmap;
		}
		public void deleteStudentCourseDetails(Student s) {
			hashmap.remove(s);
		}
		 
	}


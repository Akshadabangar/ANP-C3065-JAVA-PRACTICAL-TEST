package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.*;
import java.util.*;

public class Student_Course_DAO 
{

		public static HashMap<Student,Course> hashmap=new HashMap<Student,Course>();
		public boolean addStudentCourseDetails(Student s,Course c) {
			hashmap.put(s,c);
			boolean addstatus = false;
			addstatus=true;
			return addstatus;
		}
		public HashMap<Student, Course>getStudentCourseDetails(){
			return hashmap;
		}
		public boolean deleteStudentCourseDetails(Student s) {
			boolean status=false;
			hashmap.remove(s);
			status=true;
			return status;
		}
		 
	}


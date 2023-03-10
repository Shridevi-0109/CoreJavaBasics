package OopsSample;

import java.util.ArrayList;

public class StudentList {

	  ArrayList<Student> studList;
	  public StudentList() {
		  System.out.println("Creating Student list...");
		  studList = new ArrayList<>();
	  }
	  
	   
	  public void addStudent(Student student) {
		  System.out.println("Add student to list...");
		  studList.add(student);
		  
	  }
	  
	  public ArrayList<Student> getStudents() {
		  return studList;
		  
	  }
}


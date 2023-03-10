package OopsSample;

import java.util.ArrayList;

public abstract class StudentDriver {

	public static void main(String[] args) {
	//	Student s1 = new Student("Peter");
	//	Student s1 = new PayingStudent("Jamun" ,9.5f);	
		Student s2 = new CompanyStudent("Shri", "Zuci");
	//	Student s3 = new PayingStudent("Sheik", 8.7f);
		Student s4 = new CompanyStudent("Mohamad", "Zuci" );
		Student s5 = new AuditStudent("Hanifa", "Auditorium ");
		StudentList students = new StudentList();
	//	students.addStudent(s1);
		students.addStudent(s2);
	//	students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
			
		System.out.println("Object of s5..." + s5.toString());	 
		System.out.println("Object of s4..." + s4.toString());
	//	System.out.println("Object of s3..." + s3.toString());
	
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs)	{	
	//	stud.toString();
		stud.calculateGPA();
	//	stud.gotoclass();
		}
		
    }

	}

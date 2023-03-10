package OopsSample;

public abstract class Student {
	String name;
	String address;
	float gpa;
	
	public Student(String name) {
	    this.name = name;
	    
	}	
	public Student( ) {
		
	}
   //public Student(String name, float gpa) {
   //this.name = name;
   //this.gpa = gpa;
   //}
    
	public void gotoclass() {
		System.out.println(" Student go to class..." + this.name);
	}
	
	public final void calculateGPA() {
		System.out.println("Calculate GPA");
	}
}

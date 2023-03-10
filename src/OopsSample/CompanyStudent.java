package OopsSample;

public class CompanyStudent extends Student {
	String companyName;
	public CompanyStudent(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}
	
	public void gotoclass() {
		System.out.println("Goto to class after evaluation.." + this.name);
	}
	public String toString() {
		   String strObj = "CompanyStudent name is " + this.name;   
		   return strObj;
		   }
	}

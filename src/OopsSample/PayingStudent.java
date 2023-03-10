package OopsSample;

public abstract class PayingStudent extends Student implements PrintStudent{
      boolean madepayment;
      public PayingStudent(String name, float gpa) {
    	  super();
    	  this.name = name;
    	  this.gpa = gpa;
      }
       
      public void gotoclass() {  //gotoclass(string name) is over riding
    	  System.out.println("PayingStudent goto next class.." + this.name);
      }
      public abstract void PrintMarksheet();
      
      public String toString() {
    	   String strObj = "PayingStudent name is " + this.name;   
    	   return strObj;
    	   }
}


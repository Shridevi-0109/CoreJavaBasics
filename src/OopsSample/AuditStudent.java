package OopsSample;

  public class AuditStudent extends Student {
  String classLocation;

  
  public AuditStudent(String name, String classLocation) {
	  this.name = name;
	  this.classLocation = classLocation;
}

   public void gotoclass() {
   System.out.println("Audit student go to class --> " + this.name);
   } 
   
   public String toString() {
   String strObj = "AuditStudent name is " + this.name;   
   return strObj;
   }

}
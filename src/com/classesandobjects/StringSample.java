package com.classesandobjects;

public class StringSample {
	
	public static void main(String[] args) {
		
		String strOne = "Java";
		strOne = strOne + " Programming";
		//strOne.concat(" Language");
		strOne=strOne.concat(" Language");     //assigning (storing)
		System.out.println(" Value of strOne : " + strOne.hashCode());
		
		//Getting stores in new reference, So print strOne will be same 
		//strone.concat(" Language");

		
		//But if we assign it to string will have new reference 
		strOne=strOne.concat(" Language"); 	
    	System.out.println("Value of strone after concat: "+strOne);
    	System.out.println("Value of strone: "+strOne.hashCode());
    
    	String strTwo=new String("Functional Programming ");
     	strTwo.concat("Language");

		System.out.println(strTwo.length());
    	System.out.println(strTwo.substring (10).trim().toUpperCase()); 
    	System.out.println("Value of strone: "+strTwo);
    
    //	String strTwo = new String(" Functional Programming ");
		//strTwo=strTwo.concat("Language"); //assigning
		//System.out.println(" Value of strTwo : " + strTwo);
		
	}
}
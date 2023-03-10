package com.classesandobjects;

//import java.util.Date

public class kid {
	
	
	String name; //instance variable
	int age;
	
	public kid(String name, int age) {
		this.name = name; //instance variable
		this.age = age;
	}
	public void play() {		
	System.out.println(this.name + "is playing..." );
		
	}
	
	//method overloading
    public void printkid() {
    	System.out.println(" name of kid is :" + this.name + "and age is : " + this.age );
    }
    
    public void printkid(int studying) {
    	System.out.println("kid is studying in : " + studying );
    }
    
    public void printkid(String name, int age) {
    	System.out.println("kid is studying in :");
    }
    
    //public void printkid(Date dob) {
    	
}
    


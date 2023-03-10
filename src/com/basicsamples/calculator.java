package com.basicsamples;

public class calculator {

	//instant variable
	int number;
	//class variable
	static int c;
	int a;
	
	final double pi=3.14; 
	
			
	//a, b are parameters
	public void add(int a, int b) {
		//local variable
		
		
		int sum;
		sum=a+b;
		System.out.println(a+b); 
		
		

	}
	
	//public void area(double radius) {
		//pi = 5.23 cannot change the final value
		//double area = pi*radius*radius;
	//}
	
	public static void main(String[] args) {
		calculator calObj = new calculator();
		calObj.add(10, 25);
		calObj.number = 10;
		c = 15;
				
	}
	

	
}

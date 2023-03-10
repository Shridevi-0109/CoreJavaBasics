package com.basicsamples;

public class relationalOperators {

	public static void main(String[] args) {
 //  create variables
     int a = 7, b = 11;
	 System.out.println("a is " +a+ " and b is " +b);
     System.out.println("a == b"); //equal to
     System.out.println("a != b"); //not equal
     System.out.println("a > b");  //greater than
     System.out.println("a < b");  //less than
     System.out.println("a >= b"); //gre/. or less/.
     System.out.println("a <= b"); //less or greater 
     System.out.println((5 > 3) && (8 > 5)); //and op
     System.out.println((5 > 3) && (8 < 5)); //and op
     System.out.println((5 < 3) || (8 > 5)); //or op
     System.out.println((5 > 3) || (8 < 5)); //or op
     System.out.println((5 < 3) || (8 < 5)); //or op
     System.out.println(!(5 == 3)); //inverse
     System.out.println(!(5 > 3));  //inverse
    
   }
	
}


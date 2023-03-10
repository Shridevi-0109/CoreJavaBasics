package com.classesandobjects;

import java.util.Arrays;

public class StringExercises {

	public static void main(String[] args) {
		
		//1. Show 2 ways to concatenate the following two strings together to get the string 'Hi,mom.":
		// 1)
		String first = "hi";
        String two = "mom";
		String joinedString = first.concat(two);
		System.out.println("Joined String is: " +joinedString);
		
        // 2)
		String strOne = "Hi";
		strOne = strOne + "Mom";
	    System.out.println("Concatenated string is: " + strOne );	
	    
	    
	    
	    
	    // 2. Write a program that computes your initials  from your full name and displays them:
	    
	    
	     
	    
	    //3. An anagram is a word or a phase....
	    String str1="parliament";
		String str2="partial men,";
		boolean status=true;
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s","").replace(",", "").replace(".", "");
		if(str1.length()!=str2.length())
			status=false;
		else{
			char []a=str1.toCharArray();
			char []b=str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);	
		    status=Arrays.equals(a, b);
		}
		if(status)
			System.out.println("anagram");
		else
			System.out.println("Not");
	}

}

package com.basicsamples;

import java.util.Scanner;

public class ConsolelnSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter an integer");
		int number = input.nextInt();
		System.out.println("you entered " + number);
		
		System.out.println("enter float");
		float myfloat = input.nextFloat();
		System.out.println("Float entered " + myfloat);
		

	}

}

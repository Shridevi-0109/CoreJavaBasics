package ControlLoopSample;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	int sum = 0;
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("ENTER A NUMBER");
	int number = input.nextInt();
	
	while (number >= 0) {
		sum += number;
		
		
		System.out.println("ENTER A NUMBER : ");
		number = input.nextInt();
	}
	System.out.println("sum = " + sum);
	input.close();
}
	
}
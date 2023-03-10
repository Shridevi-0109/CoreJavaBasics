package ControlLoopSample;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int sum = 0;
		int number = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			sum += number;
			
			
			System.out.println("ENTER A NUMBER : ");
			number = input.nextInt();
		}while(number>0);
		
		System.out.println("sum = " + sum);
		input.close();

	}

}

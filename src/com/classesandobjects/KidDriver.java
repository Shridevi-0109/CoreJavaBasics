package com.classesandobjects;

public class KidDriver {

	public static void main(String[] args) {

		//	kid kidOne = new kid();
		kid kidOne = new kid("Pinky ", 8);
		kidOne.play();
		kid kidTwo = new kid("Wicky ", 8);
		System.out.println(kidTwo.name);
		kidTwo.play();
		kidTwo = null;
		

	}

}

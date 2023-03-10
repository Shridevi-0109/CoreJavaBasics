package com.classesandobjects;

import java.text.NumberFormat;
import java.util.Locale;


public class PercentageSample {

	public static void main(String[] args) {
		
	    //percentages
		
		Double percent = new Double (0.75);
		NumberFormat percentFormatter;
		String percentOut; 
		
		
		percentFormatter = NumberFormat.getPercentInstance(Locale.US);
		percentOut = percentFormatter.format(percent);
		System.out.println(percentOut);
		
	}

	}



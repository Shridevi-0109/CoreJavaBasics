package com.classesandobjects;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencySample {

	public static void main(String[] args) {
		
		//currencies
		Double currency = new Double(9876543.21);
		NumberFormat currencyFormatter;
		String currencyOut;	
		
		currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		currencyOut = currencyFormatter.format(currency);
		System.out.println(currencyOut);
		

	}
}
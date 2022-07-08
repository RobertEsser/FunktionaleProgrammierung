package de.telekom.sea7.fp;

import java.util.Arrays;
import java.util.List;

public class Mathe_ist_toll {

	// "neutrales Element"

	// Addition
	// 9 + 0 = 9

	// Multiplikation
	// 7 * 1 = 7

	public static void addall_classic() {
		List<Integer> zahlen = Arrays.asList(1, 2, 3, 4);
		
		Integer summe = 0; // neutrale Element
		
		for(Integer zahl : zahlen ) {
			summe = summe + zahl;
		}
		
		System.out.println(summe);

	}

	public static void addall_neu() {
		List<Integer> zahlen = Arrays.asList(1, 2, 3, 4);
		
		// 1. Zeile
		
		Integer summe = zahlen.stream().reduce( 0, (op1,op2) -> op1 + op2 );
		
		System.out.println(summe);

	}
	
	
}

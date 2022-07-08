package de.telekom.sea7.fp;


import static de.telekom.sea7.fp.Mathematics.add_methode;

import static de.telekom.sea7.fp.DoSomething.doSomethingWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		int k = 3;
		int j = 7;
		
		var r1 = 3 + 7; 
		
		int r2 = add_methode( 3, 7 );
		
		BiFunction<Integer,Integer,Integer> add_lambda = (left, right) -> left + right; // lambda-Ausdruck
		
        System.out.println( add_lambda.getClass() );
		
		
		
		
		int r3 = add_lambda.apply(3, 7); 
		
//		// -- explizt eine Klasse schreiben
//		Add add = new Add();
//		
//		int r4 = add.apply(3,  7);	
		
//		// -- eine Klasse schreiben ohne eine Klasse zu schreiben
//		var add2 = new BiFunction<Integer,Integer,Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t + u;
//			}
//			
//		};
		
		Person peter = new Person( "Peter" );
		Person paul = new Person( "Paul ");
		Person mary = new Person( "Mary" );
		Person anton = new Person("Anton");
		
		List<Person> alle = Arrays.asList(peter, paul, mary, anton );
		
		for( int i = 0; i < alle.size(); i++) {
		   alle.get(i).saySomething();
		}
		
		for(Person p : alle) {
			p.saySomething();
		}
		
		// fuerAlle_in_alle_saySomething_aufrufen(alle);
		// fuerAlle_in_alle_eatSomething_aufrufen(alle);
		
		for_each(alle, (p) -> p.saySomething() );

		for_each(alle, (p) -> p.eatSomething() );
		
		for_each(alle, 				
				new Consumer<Person>() {
					@Override
					public void accept(Person t) {
						t.saySomething();
					}
				}
		);
		
		
		//
		alle.forEach( (p) -> p.saySomething());
		
//		List<Person> alle_telekom_kunden; // ca. 20.000.000 * 4
		
//      alle, ergebnis0, ergebnis1, ergebnis2: 4 Listen		
//		List<Person> ergebnis0 = fuerAlle_in_alle_mache_verb(alle,
//				(p) -> p
//				);
//		
//		List<Person> ergebnis1_0 = unsere_filter_funktion(alle,
//				(p) -> !p.getName().startsWith("A")
//				);
//		
//		List<Person> ergebnis1 = fuerAlle_in_alle_mache_verb(ergebnis1_0,
//				(p) -> p.changeName("Name " )
//				);
//		
//		List<Person> ergebnis2 = fuerAlle_in_alle_mache_verb(ergebnis1,
//				(p) -> p.changeName("Das ist der " )
//				);
		
		// Hier: zwei Listen
		var ergebnis3 = alle.stream()
		    .map( (p) -> p )
		    
		    .filter( (p) -> p.getName().startsWith("A") ) // 10 Zeilen Code (gespart)
		    
		    // .filter( new UnserFilter() )
		    
		    .map( (p) -> p.changeName("Name "))
		    .map( (p) -> p.changeName("Das ist der "))
		    
		    // .reduce(null, null );
		    .collect( Collectors.toList() )
		;
		
		
		for(Person p : ergebnis3 ) {
		    System.out.println( p.getName());
		}
		
		Mathe_ist_toll.addall_classic();
		Mathe_ist_toll.addall_neu();
			}	
	
//	public static void fuerAlle_in_alle_saySomething_aufrufen(List<Person> alle) {
//		for(Person p : alle) {
//			// p.saySomething();
//		}
//	}
//
//	public static void fuerAlle_in_alle_eatSomething_aufrufen(List<Person> alle) {
//		for(Person p : alle) {
//			// p.eatSomething();
//		}
//	}

	public static void for_each(List<Person> alle,
			
		Consumer<Person> verb) { // lambda-Ausdruck als Parameter
		
		for(Person p : alle) {
			verb.accept( p ); // nutze den lambda-Ausdruck
		}
	}
	
	
	public static List<Person> fuerAlle_in_alle_mache_verb(List<Person> alle,
			
			Function<Person,Person> verb
			
			) {
		List<Person> neue_liste = new ArrayList<Person>();
		
		for(Person p : alle) {
			Person neue_person = verb.apply(p);
			neue_liste.add(neue_person);
		}
		return neue_liste;
	}
	

	public static List<Person> unsere_filter_funktion(
			List<Person> alle,
			Predicate<Person> test_lambda_ausdruck
			) {
		List<Person> gefilterte_liste = new ArrayList<Person>();
		
		for(Person p : alle) {
			// if( !p.getName().startsWith("A") ) {			
			if( test_lambda_ausdruck.test(p) ) {
			    gefilterte_liste.add(p);
			}
		}
		return gefilterte_liste;
	}
	
	
	
	
	// Keine Methoden 
	
//	public static class Lambda2 implements BiFunction<Integer,Integer,Integer> {
//
//		@Override
//		public Integer apply(Integer t, Integer u) {
//			return t + u;
//		}
//	
//	}
	
}

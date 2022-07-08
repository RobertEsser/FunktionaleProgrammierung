package de.telekom.sea7.fp;

/*
 * Oracle Referenz zu "Functional Interfaces" 
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/package-summary.html
 * 
 */
// Hier zusammengefasst, in Java sind das EINZELNE interface
public interface WelcheFunktionenKannIchHaben {

	// add, subtract, multiply, divide
	
	public void name0();
	
	public void accept(Object param1); // -> Interface Consumer
	
	public Object get(); // -> Interface Supplier (Producer)
	
	public Object apply(Object param1); // Function
	
	// ---
	
	public void accept(Object param1, Object param2 ); // BiConsumer
	
	public Object apply(Object param1, Object param2 ); // BiFunction

	// --- noch mehr Parameter
	
	public boolean test(Object param1 ); // Predicate
	
	public boolean test(Object param1, Object param2 ); // BiPredicate
	
}

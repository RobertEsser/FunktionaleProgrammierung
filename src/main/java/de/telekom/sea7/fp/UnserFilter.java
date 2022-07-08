package de.telekom.sea7.fp;

import java.util.function.Predicate;

public class UnserFilter implements Predicate<Person> {
	
	// (p) -> !p.getName().startsWith("A")
	public boolean test( Person p ) {
		
		return !p.getName().startsWith("A");
	}
}

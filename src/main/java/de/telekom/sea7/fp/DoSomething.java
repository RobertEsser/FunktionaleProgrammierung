package de.telekom.sea7.fp;

import java.util.function.Consumer;

public class DoSomething {
	public static void doSomethingWith(Person objekt,
			
			Consumer<Person> verb
		
			) {
		System.out.println("Asking Paul to say something");
		verb.accept(objekt);
		
	}
}


// objekt.saySomething();
// objekt.eatSomething();

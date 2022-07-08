package de.telekom.sea7.fp;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person changeName( String newname ) {
		this.name = newname + ": " + this.name;
		return this;
	}
	
	
	// --

	void saySomething() {
		System.out.println("42");
	}
	
	void eatSomething() {
		System.out.println("Banane");
	}
}

package com.nt.creational.prototypedesignpattern;

public class MainPrototype {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Roshan", "Java Developer");
		Employee emp2 = (Employee) emp1.clone();
		emp1.showDetails();
		emp2.showDetails();
		emp2.setName("rakesh");
		System.out.println(emp2);

	}

}
/*
 * 
 * 
 * 
 * 🔹 Definition
 * 
 * Prototype pattern creates new objects by cloning an existing object instead
 * of using new.
 * 
 * 🔹 Why use it Avoid costly object creation (DB calls, heavy setup) Reduce
 * repetitive code Get same data + independent objects 🔹 Where used Templates
 * (user settings, documents) Game objects (enemy cloning) Spring prototype
 * beans Undo/backup systems 🔹 When to use
 * 
 * ✔ Object creation is expensive ✔ Need many similar objects ✔ Want independent
 * copies (change one → others not affected)
 * 
 * 🔹 When NOT to use
 * 
 * ❌ Object is simple ❌ Cloning is complex
 * 
 * 🔹 Key concept Same data initially Different objects in memory 🔹 One-line
 * interview answer
 * 
 * 
 * “Prototype pattern creates objects by cloning an existing instance to improve
 * performance and allow independent copies.”
 * 
 * 
 * 
 * 
 */

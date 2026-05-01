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

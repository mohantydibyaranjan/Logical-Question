package com.nt.creational.abstractfactorypattern;

public class Main {
	public static void main(String[] args) {
		TechFactory factory = new AppleFactory();
		Phone myPhone = factory.createPhone();
		Charger myChrger = factory.createCharger();
		myPhone.call();
		myChrger.plugIn();

	}
}
/*
 * Abstract Factory pattern provides an interface to create families of related
 * objects without specifying their concrete classes.
 * 
 * 🔹 Why use it
 * 
 * 
 * Create related objects together (consistent set)
 * 
 * 
 * Avoid tight coupling with concrete classes
 * 
 * 
 * Make system scalable and flexible
 * 
 * 
 * 
 * 🔹 Where used
 * 
 * 
 * UI frameworks (Windows / Mac themes → buttons, menus, dialogs)
 * 
 * 
 * Cross-platform applications
 * 
 * 
 * Database drivers (MySQL / Oracle families)
 * 
 * 
 * Spring framework (bean families/configurations)
 * 
 * 
 * 
 * 🔹 When to use (conditions) ✔ When you need families of related objects ✔
 * When objects must be used together consistently ✔ When you want to switch
 * entire system behavior easily
 * 
 * 🔹 When NOT to use ❌ If only one type of object is needed ❌ If system is
 * simple (adds unnecessary complexity)
 * 
 * 🔹 Key concept
 * 
 * 
 * Factory of factories
 * 
 * 
 * Produces multiple related objects (not just one)
 * 
 * 
 * 
 * 🔹 One-line interview answer 👉 “Abstract Factory pattern provides an
 * interface to create families of related objects without specifying their
 * concrete classes.”
 * 
 * 
 * 
 */
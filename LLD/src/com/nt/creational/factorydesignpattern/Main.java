package com.nt.creational.factorydesignpattern;

public class Main {

	public static void main(String[] args) {
		NotificationFactory n = new NotificationFactory();
		Notification notification = n.createNotification(NotificationType.EMAIL);
		notification.notifyUser();
		;

	}

}

/*
 * Factory pattern provides an interface or method to create objects, but lets
 * subclasses or logic decide which object to create.
 * 
 * 🔹 Why use it
 * 
 * 
 * Avoid direct use of new (loose coupling)
 * 
 * 
 * Centralize object creation logic
 * 
 * 
 * Make code flexible and scalable
 * 
 * 
 * 
 * 🔹 Where used
 * 
 * 
 * Payment systems (CreditCard / UPI / PayPal)
 * 
 * 
 * Notification systems (Email / SMS / Push)
 * 
 * 
 * Parsers (JSON / XML)
 * 
 * 
 * Logging frameworks
 * 
 * 
 * Frameworks like Spring (Bean creation)
 * 
 * 
 * 
 * 🔹 When to use (conditions) ✔ When you have multiple similar classes ✔ When
 * object creation depends on input/condition ✔ When you want to hide creation
 * logic from client
 * 
 * 🔹 When NOT to use ❌ If only one simple object is needed ❌ If adding factory
 * increases unnecessary complexity
 * 
 * 🔹 Key concept
 * 
 * 
 * Client does NOT create object directly
 * 
 * 
 * Factory decides which object to return
 * 
 * 
 * 
 * 🔹 One-line interview answer 👉 “Factory pattern defines a method to create
 * objects and lets subclasses or conditions decide which class to instantiate.”
 * 
 * 
 */
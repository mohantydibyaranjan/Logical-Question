package com.nt.creational.behavioural.strategydesignpattern;

public class Main {
	public static void main(String[] args) {
		ShoppingCart sh = new ShoppingCart();
		sh.setPaymentStrategy(new PayByCreditCard());
		sh.checkOut(5001);
		sh.setPaymentStrategy(new PaybyPaypal());
		sh.checkOut(4001);
	}

}
/*
 * The Strategy Design Pattern is essentially a "Plug-and-Play" system for your
 * code. It allows you to switch the logic of a task at runtime without changing
 * the class that uses it.
 * 
 * 🏗️ The 3-Layer Structure To understand it easily, think of it in three
 * parts:
 * 
 * The Interface (The Contract): A common "plugin" port (e.g., PaymentMethod).
 * 
 * The Strategies (The Plugins): Different implementations that plug in (e.g.,
 * Paypal, CreditCard, Bitcoin).
 * 
 * The Context (The Machine): The object that uses the plugin (e.g.,
 * CheckoutProcess). It doesn't care which plugin is inside; it just knows it
 * can call .pay().
 * 
 * 🎯 Why and When to Use It? Avoid "If-Else" Hell: Use it when you find
 * yourself writing giant switch or if-else blocks to decide which logic to run.
 * 
 * Open/Closed Principle: You can add a new strategy (like ApplePay) by creating
 * a new class without touching your existing, tested checkout logic.
 * 
 * Runtime Switching: Use it when the "How" needs to change based on user input
 * (e.g., a user choosing a "Fastest Route" vs. "Shortest Route" in a GPS app).
 * 
 * ⚖️ Pros and Cons Pros: Clean code, easy to test individual strategies, and
 * follows SOLID principles.
 * 
 * Cons: You end up with many small classes, and the client code must be aware
 * of which strategy to pick.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

package com.nt.creational.singletondesignpattern;

public class Singleton {

	// volatile keyword for multiple threads for handles that variable properly
	private static volatile Singleton instance;

	private Singleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();

					// Second check (with locking) - prevents a second thread from creating
					// another instance if it was waiting just outside the synchronized block
				}
			}

		}

		return instance;

	}

	public void showMessage() {
		System.out.println("Hello from the Singleton class");
	}

}

package com.nt.creational.singletondesignpattern;

public class MainSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		s1.showMessage();
	}

}
/*
 * 
 * 🔹 Definition
 * 
 * Singleton pattern ensures that only one instance of a class exists in the
 * entire application and provides a global access point to it.
 * 
 * 🔹 Why use it Avoid creating multiple objects unnecessarily Ensure consistent
 * shared state Save memory/resources 🔹 Where used Logging systems Database
 * connections Configuration/settings objects Caching Thread pools 🔹 When to
 * use (conditions)
 * 
 * ✔ Only one object is required globally ✔ Object is shared across multiple
 * classes ✔ Need centralized control (e.g., config, logger)
 * 
 * 🔹 When NOT to use
 * 
 * ❌ If multiple instances are needed ❌ If it makes testing difficult (tight
 * coupling)
 * 
 * 🔹 Key concept One instance only Global access (getInstance() method) 🔹
 * One-line interview answer
 * 
 * 👉 “Singleton pattern ensures a class has only one instance and provides a
 * global point of access to it.
 * 
 */
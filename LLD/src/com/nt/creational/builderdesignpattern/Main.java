package com.nt.creational.builderdesignpattern;

public class Main {
	public static void main(String[] args) {
		NetworkRequest getRequest = new NetworkRequest.Builder().url("https://api.example.com/users").build();
		NetworkRequest postRequest = new NetworkRequest.Builder().url("https://api.example.com/login").method("POST")
				.body("{ \"user\": \"admin\" }").timeout(10000).useCache(false).build();
		System.out.println(getRequest);
		System.out.println(postRequest);

	}

}

/*
 * 
 * Builder pattern is used to construct complex objects step-by-step, allowing
 * you to create different representations of an object using the same
 * construction process.
 * 
 * 🔹 Why use it
 * 
 * 
 * Handle objects with many parameters
 * 
 * 
 * Avoid constructor confusion (telescoping constructor problem)
 * 
 * 
 * Improve readability and maintainability
 * 
 * 
 * Create immutable objects safely
 * 
 * 
 * 
 * 🔹 Where used
 * 
 * 
 * Creating complex objects (e.g., User, Order, Configuration)
 * 
 * 
 * String building (StringBuilder in Java)
 * 
 * 
 * APIs with many optional fields
 * 
 * 
 * Frameworks like Lombok (@Builder)
 * 
 * 
 * 
 * 🔹 When to use (conditions) ✔ Object has many fields (especially optional
 * ones) ✔ Construction needs to be step-by-step ✔ Want readable and flexible
 * object creation
 * 
 * 🔹 When NOT to use ❌ Object is simple (few fields) ❌ No need for step-by-step
 * construction
 * 
 * 🔹 Key concept
 * 
 * 
 * Separate object construction from representation
 * 
 * 
 * Use builder methods to set values step-by-step
 * 
 * 
 * 
 * 🔹 One-line interview answer 👉 “Builder pattern is used to construct complex
 * objects step-by-step, improving readability and handling multiple optional
 * parameters.”
 * 
 * 
 * 
 */

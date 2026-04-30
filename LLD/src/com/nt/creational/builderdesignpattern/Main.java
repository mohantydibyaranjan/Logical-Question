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

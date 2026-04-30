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

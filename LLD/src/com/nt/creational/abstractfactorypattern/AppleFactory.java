package com.nt.creational.abstractfactorypattern;

public class AppleFactory implements TechFactory {

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new Iphone();
	}

	@Override
	public Charger createCharger() {
		// TODO Auto-generated method stub
		return new LightingCharger();
	}

}

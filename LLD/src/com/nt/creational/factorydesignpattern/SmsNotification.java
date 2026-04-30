package com.nt.creational.factorydesignpattern;

public class SmsNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notification Should be sms type");

	}

}

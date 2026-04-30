package com.nt.creational.factorydesignpattern;

public class EmailNotificationImps implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notificatuion will Email type");

	}

}

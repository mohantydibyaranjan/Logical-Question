package com.nt.creational.factorydesignpattern;

public class Main {

	public static void main(String[] args) {
		NotificationFactory n = new NotificationFactory();
		Notification notification = n.createNotification(NotificationType.EMAIL);
		notification.notifyUser();
		;

	}

}

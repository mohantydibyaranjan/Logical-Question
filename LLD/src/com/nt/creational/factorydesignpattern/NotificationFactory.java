package com.nt.creational.factorydesignpattern;

public class NotificationFactory {

	// Parameter is now the Enum itself
	public Notification createNotification(NotificationType type) {

		// Basic null check is still good practice
		if (type == null) {
			throw new IllegalArgumentException("Notification type cannot be null");
		}

		// Direct switch on the Enum constants
		return switch (type) {
		case EMAIL -> new EmailNotificationImps();
		case SMS -> new SmsNotification();
		};
	}
}
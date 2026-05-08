package com.nt.creational.behavioural.observerdesignpattern;

public interface Subject {
	void subscribe(Subscriber s);

	void unsubscribe(Subscriber s);

	void notifySubscribers(String title);
}
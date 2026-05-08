package com.nt.creational.behavioural.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber s) {
		subscribers.add(s);
	}

	@Override
	public void unsubscribe(Subscriber s) {
		subscribers.remove(s);
	}

	@Override
	public void notifySubscribers(String title) {
		for (Subscriber s : subscribers) {
			s.update(title);
		}
	}

	// Business Logic: Uploading a video triggers the notification
	public void uploadVideo(String title) {
		System.out.println("Channel: Uploading " + title);
		notifySubscribers(title);
	}
}
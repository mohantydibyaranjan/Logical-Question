package com.nt.creational.behavioural.observerdesignpattern;

public class Main {
	public static void main(String[] args) {
		YoutubeChannel myChannel = new YoutubeChannel();

		User user1 = new User("Alice");
		User user2 = new User("Bob");

		myChannel.subscribe(user1);
		myChannel.subscribe(user2);

		// This will notify Alice and Bob
		myChannel.uploadVideo("Design Patterns 101");

		myChannel.unsubscribe(user1);

		// This will only notify Bob
		myChannel.uploadVideo("Spring Boot Tutorial");
	}
}
/*
 * 
 * 
 * Design Pattern Note: Observer Pattern 1. Definition The Observer Pattern is a
 * behavioral design pattern that defines a one-to-many dependency between
 * objects. When one object (the Subject) changes its state, all its dependents
 * (Observers) are notified and updated automatically.
 * 
 * 2. Why we use it (The Problem vs. Solution) The Problem (Polling): Without
 * this pattern, an object would have to constantly ask another object,
 * "Has your state changed yet?" This wastes CPU cycles and creates tight
 * coupling.
 * 
 * The Solution (Push Model): The Subject maintains a list of interested
 * observers. When a change happens, the Subject "pushes" the update to everyone
 * on the list.
 * 
 * 3. Core Components Subject (Interface/Abstract Class):
 * 
 * Maintains a list of observers.
 * 
 * Provides methods to attach() (subscribe), detach() (unsubscribe), and
 * notifyObservers().
 * 
 * Concrete Subject:
 * 
 * The object being watched.
 * 
 * When its state changes, it calls the notify() method from the base class.
 * 
 * Observer (Interface):
 * 
 * The "contract" for any object that wants to be notified.
 * 
 * Contains the update() method.
 * 
 * Concrete Observer:
 * 
 * The actual objects (e.g., EmailService, SMSLogger, Dashboard) that react to
 * the update.
 * 
 * 5. Pros and ConsAdvantagesDisadvantagesLoose Coupling: The Subject doesn't
 * need to know the specific class of the observer.Memory Leaks: If observers
 * aren't "detached" properly, they can stay in memory forever (Lapsed Listener
 * problem).Open/Closed Principle: You can add new observer types without
 * changing the Subject's code.Random Order: Observers are usually notified in
 * an unpredictable order.Real-time Updates: Supports broadcast-style
 * communication.Update Complexity: If there are too many observers, a single
 * state change can slow down the system.
 * 
 *  6. Real-World Use CasesSocial Media:
 * When a celebrity posts a tweet, all followers (Observers) get a
 * notification.GUI Event Handling: Buttons in Java (Swing/JavaFX) or
 * JavaScript. The button is the Subject, and your click-handler is the
 * Observer.Spring Boot: ApplicationListener and ApplicationEvent.Reactive
 * Programming: Frameworks like RxJava or Project Reactor are essentially the
 * Observer pattern on steroids. 
 * 
 * 7. Comparison with Pub-SubPeople often confuse
 * Observer with Publish-Subscribe.Observer: The Subject and Observer know each
 * other (even if loosely). It usually happens within a single application's
 * memory.Pub-Sub: There is a "Message Broker" (like Kafka or RabbitMQ) in the
 * middle. The Publisher and Subscriber never meet.
 */

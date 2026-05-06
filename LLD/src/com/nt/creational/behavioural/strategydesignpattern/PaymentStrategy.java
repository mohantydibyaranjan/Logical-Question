package com.nt.creational.behavioural.strategydesignpattern;

public interface PaymentStrategy {
	void collectPaymentDetails();

	boolean pay(int amount);
}
package com.nt.creational.behavioural.strategydesignpattern;

public class ShoppingCart {

	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkOut(int amount) {
		paymentStrategy.collectPaymentDetails();
		paymentStrategy.pay(amount);
	}

}

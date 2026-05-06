package com.nt.creational.behavioural.strategydesignpattern;

public class PaybyPaypal implements PaymentStrategy {

	@Override
	public void collectPaymentDetails() {
		System.out.println("PaybyPaypal.collectPaymentDetails()");

	}

	@Override
	public boolean pay(int amount) {
		System.out.println("PaybyPaypal.pay()");
		return true;
	}

}

package com.nt.creational.behavioural.strategydesignpattern;

public class PayByCreditCard implements PaymentStrategy {

	@Override
	public void collectPaymentDetails() {
		System.out.println("PayByCreditCard.collectPaymentDetails()");

	}

	@Override
	public boolean pay(int amount) {
		System.out.println("PayByCreditCard.pay()");
		return true;
	}

}

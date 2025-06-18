package com.spe.strategies;

public class PaymentContext {
	 private PaymentStrategy paymentStrategy;

	    public void setPaymentStrategy(PaymentStrategy strategy) {
	        this.paymentStrategy = strategy;
	    }

	    public void payAmount(double amount) {
	        if (paymentStrategy == null) {
	            System.out.println("No payment strategy selected.");
	        } else {
	            paymentStrategy.pay(amount);
	        }
	    }
}

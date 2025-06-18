package com.ape.adapter;

public class Main {
	 public static void main(String[] args) {
	       
	        StripeGateway stripe = new StripeGateway();
	        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
	        stripeProcessor.processPayment(250.00);

	        
	        PayPalGateway paypal = new PayPalGateway();
	        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
	        paypalProcessor.processPayment(120.75);
	    }
}

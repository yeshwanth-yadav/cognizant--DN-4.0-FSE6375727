package com.spe.strategies;

public class Main {
	public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

       
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Yeshwanth Yadav"));
        context.payAmount(1500.0);

        context.setPaymentStrategy(new PayPalPayment("yeshwanth@email.com"));
        context.payAmount(2200.5);
    }
}

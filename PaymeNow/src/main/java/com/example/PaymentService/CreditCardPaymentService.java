package com.example.PaymentService;

public class CreditCardPaymentService implements PaymentService {

	
	@Override
	public void processPayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing credit card payment of $"+amount );

	}
	

}

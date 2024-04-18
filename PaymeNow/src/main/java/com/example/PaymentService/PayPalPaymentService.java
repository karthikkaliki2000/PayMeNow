package com.example.PaymentService;

public class PayPalPaymentService implements PaymentService {
;
	@Override
	public void processPayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing pay pal payment of $"+amount );

	}
	
}

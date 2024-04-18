package com.example.PaymentService;

public class BankTransferPaymentService implements PaymentService {

	@Override
	public void processPayment(int amount ){
		// TODO Auto-generated method stub
		System.out.println("Processing bank transfer payment of $"+amount );

	}
	

}

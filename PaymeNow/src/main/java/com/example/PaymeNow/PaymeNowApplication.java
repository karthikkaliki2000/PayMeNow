package com.example.PaymeNow;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.PaymentService.PaymentService;

@SpringBootApplication
public class PaymeNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymeNowApplication.class, args);
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter payment amount");
		int amount=s.nextInt();
		System.out.println("Enter payment method (CreditCard, PayPal, or BankTransfer)");
		String method=s.next();
		String service=null;
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		if(method.equals("CreditCard")) {
			service="creditCardPaymentService";
		}
		else if(method.equals("BankTransfer")) {
			service="bankTransferPaymentService";
		}
		else if(method.equals("PayPal")) {
			service="payPalPaymentService";
		}
		PaymentService paymentService=(PaymentService)context.getBean(service);
		paymentService.processPayment(amount);
		
	}

}

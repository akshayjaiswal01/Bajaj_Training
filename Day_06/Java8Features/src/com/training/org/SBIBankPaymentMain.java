package com.training.org;

public class SBIBankPaymentMain 
{
	public static void main(String[] args) {
		Payments payment = new CreditCard();
		payment.logTransaction(10000);
		payment.pay(1000);
	}
}

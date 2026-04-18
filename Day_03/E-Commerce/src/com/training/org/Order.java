package com.training.org;

public interface Order 
{
	void placeOrder();
	
	void cancleOrder(int orderId) throws InvalidOrderException;
	
	int getOrderId();
}

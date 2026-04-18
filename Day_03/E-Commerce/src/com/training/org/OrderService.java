package com.training.org;

import java.util.ArrayList;

public class OrderService 
{
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addOrder(Order order)
	{
		orders.add(order);
	}
	
	public void cancelOrder(int orderId) throws InvalidOrderException
	{
		for(Order order : orders)
		{
			if(order.getOrderId() == orderId)
			{
				order.cancleOrder(orderId);
				return;
			}
		}
		
		throw new InvalidOrderException("Order Id does not exixts");
	}
}

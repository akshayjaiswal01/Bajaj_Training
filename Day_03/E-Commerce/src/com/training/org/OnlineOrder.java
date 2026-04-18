package com.training.org;

public class OnlineOrder implements Order 
{
	private int orderId;
	private String productName;
	private double amount;
	private String deliveryAddress;
	private String status;
	
	public OnlineOrder(int orderId, String productName, double amount, String deliveryAddress) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.amount = amount;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
	}

	@Override
	public void placeOrder() 
	{
		status = "Placed";
		System.out.println("Online order placed successfully");
		
	}

	@Override
	public void cancleOrder(int orderId) throws InvalidOrderException 
	{
		if(this.orderId != orderId)
		{
			throw new InvalidOrderException("Order Id not found");
		}
		
		if(status.equals("Cancelled"))
		{
			throw new InvalidOrderException("Order already cancelled");
		}
		
		status = "Cancelled";
		System.out.println("Online Order cancelled successfully");
		
	}

	@Override
	public int getOrderId() 
	{
		return orderId;
	}

}

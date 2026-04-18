package com.training.org;

public class StoreOrder implements Order
{
	private int orderId;
	private String productName;
	private double amount;
	private String storeLocation;
	private String status;

	public StoreOrder(int orderId, String productName, double amount, String storeLocation) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.amount = amount;
		this.storeLocation = storeLocation;
		this.status = status;
	}

	@Override
	public void placeOrder() 
	{
		status = "Placed";
		System.out.println("Store Order placed successfully");
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
		System.out.println("Store Order is cancelled successfully");
		
	}

	@Override
	public int getOrderId() {
		
		return orderId;
	}
	
}

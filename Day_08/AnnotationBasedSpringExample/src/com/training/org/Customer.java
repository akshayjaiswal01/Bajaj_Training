package com.training.org;

import org.springframework.beans.factory.annotation.Required;

public class Customer 
{
	private int custId;
	private String custName;
	private String custLocation;
	
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String custName, String custLocation) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custLocation = custLocation;
	}
	
	public int getCustId() {
		return custId;
	}
	
	@Required
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}
	
	@Required
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustLocation() {
		return custLocation;
	}
	
	@Required
	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custLocation=" + custLocation + "]";
	}
	
	
}

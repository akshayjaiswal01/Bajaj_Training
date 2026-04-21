package com.training.entity;

public class Customer 
{
	private int custId;
    private String custName;
    private String custAddress;
    private String custMob;
    private Billbook bill;
	public Customer(int custId, String custName, String custAddress, String custMob, Billbook bill) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custMob = custMob;
		this.bill = bill;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public Billbook getBill() {
		return bill;
	}
	public void setBill(Billbook bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", custMob="
				+ custMob + ", bill=" + bill + "]";
	}
	
	
	
}

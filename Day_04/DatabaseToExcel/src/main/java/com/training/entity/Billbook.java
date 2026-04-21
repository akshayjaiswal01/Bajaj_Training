package com.training.entity;

import java.sql.Date;

public class Billbook 
{
	private int billId;
    private String billDate;
    private String product;
    private int quantity;
    private double totalAmount;
	public Billbook(int billId, String billDate, String product, int quantity, double totalAmount) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.product = product;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Billbook [billId=" + billId + ", billDate=" + billDate + ", product=" + product + ", quantity="
				+ quantity + ", totalAmount=" + totalAmount + "]";
	}
	
	
	
}
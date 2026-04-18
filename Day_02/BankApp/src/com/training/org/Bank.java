package com.training.org;

public class Bank 
{
	private String bankName;
	private String bankLocation;
	
	public Bank() 
	{
		this.bankName = "";
		this.bankLocation = "";
	}

	public Bank(String bankName, String bankLocation) 
	{
		super();
		this.bankName = bankName;
		this.bankLocation = bankLocation;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankLocation=" + bankLocation + "]";
	}
	
	
	
	
}

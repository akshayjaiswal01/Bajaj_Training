package com.training.org;

public class Customer {
    private int custId;
    private String custName;
    private String custAddress;
    private String custMobNo;
    private Account account;

    public Customer(int custId, String custName, String custAddress, String custMobNo, Account account) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custMobNo = custMobNo;
        this.account = account;
    }

    public int getCustId() { return custId; }
    public String getCustName() { return custName; }
    public Account getAccount() { return account; }

    @Override
    public String toString() {
        return "Customer [ID=" + custId + ", Name=" + custName +
               ", Balance=" + account.getBalance() + "]";
    }
}
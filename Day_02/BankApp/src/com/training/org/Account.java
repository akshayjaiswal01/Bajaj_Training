package com.training.org;

import java.util.ArrayList;

public class Account {
    private int accountNo;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(int accountNo) {
        this.accountNo = accountNo;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNo() { return accountNo; }
    public double getBalance() { return balance; }
    public ArrayList<Transaction> getTransactions() { return transactions; }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("CREDIT", amount));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("DEBIT", amount));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account [No=" + accountNo + ", Balance=" + balance + "]";
    }
}
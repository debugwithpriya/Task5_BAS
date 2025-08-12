package com.el.bas;

import java.util.ArrayList;

public class Account {
	private String name;
	private double balance;
	private ArrayList<String> transactionHistory;

	public Account(String name) {
		this.name = name;
		this.balance = 0.0;
		this.transactionHistory = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add("Deposited rs." + amount);
			System.out.println("Deposited rs." + amount);
		} else {
			System.out.println("Please deposit a valid amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Not enough balance.");
		} else if (amount > 0) {
			balance -= amount;
			transactionHistory.add("Withdraw rs." + amount);
			System.out.println("Withdraw rs." + amount);
		} else {
			System.out.println("Please enter a valid amount to withdraw!");
		}
	}

	public void showBalance() {
		System.out.println("Current balance: rs." + balance);
	}

	public void showTransactionHistory() {
		if (transactionHistory.isEmpty()) {
			System.out.println("\nNo transactions yet.");
		} else {
			System.out.println("\nTransaction History:");
			for (String txn : transactionHistory) {
				System.out.println(txn);
			}
		}
	}
}

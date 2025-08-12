package com.el.bas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account holder name: ");
		String name = sc.nextLine();
		Account account = new Account(name);

		int choice;
		do {
			System.out.println("\n==== Bank Menu ====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Balance");
			System.out.println("4. Show Transaction History");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;

			case 2:
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 3:
				System.out.println("Account Holder: " + account.getName());
				account.showBalance();
				break;

			case 4:
				account.showTransactionHistory();
				break;

			case 5:
				System.out.println("Thank you for using Elevate Lab bank app!");
				break;

			default:
				System.out.println("Invalid choice. Please choose again.");
			}

		} while (choice != 5);

		sc.close();
	}
}

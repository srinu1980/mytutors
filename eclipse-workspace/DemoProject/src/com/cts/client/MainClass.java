package com.cts.client;

import java.util.List;
import java.util.Scanner;

import com.cts.dao.BankAccountDAO;
import com.cts.dao.impl.BankAccountDAOImpl;
import com.cts.model.BankAccount;

public class MainClass {

	public static void main(String[] args) {

		BankAccountDAO bservice = new BankAccountDAOImpl();

		bservice.addBankAccount(new BankAccount(1, "A", 10000));
		bservice.addBankAccount(new BankAccount(2, "B", 50000));
		bservice.addBankAccount(new BankAccount(3, "C", 80000));
		bservice.addBankAccount(new BankAccount(4, "D", 40000));
		bservice.addBankAccount(new BankAccount(5, "E", 90000));

		List<BankAccount> list;
		/*
		 * = bservice.showAllAccounts();
		 * 
		 * for (BankAccount acc : list) { System.out .println(acc.getAccountNumber() +
		 * "    " + acc.getCustomerName() + "   " + acc.getAccountBalance()); }
		 */
		Scanner sc = new Scanner(System.in);
		int option;
		String choice = "";
		do {

			System.out.println("Bank Account Application");
			System.out.println("=============================");
			System.out.println("1. Add New Customer Account");
			System.out.println("2. To display all Customer");

			System.out.println("Enter your Choice (1-2)  :");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter Account Number :");
				int accno = sc.nextInt();

				System.out.println("Enter Customer Name :");
				String accName = sc.next();

				System.out.println("Enter Balance ");
				int balance = sc.nextInt();

				bservice.addBankAccount(new BankAccount(accno, accName, balance));

				System.out.println("New Account Added Successfully...");
				break;

			case 2:

				list = bservice.showAllAccounts();
				System.out.println("AccountNo      Name              Balance");
				System.out.println("============================================");
				for (BankAccount acc : list) {
					System.out.println(
							acc.getAccountNumber() + "    " + acc.getCustomerName() + "   " + acc.getAccountBalance());
				}
				break;
			}
			System.out.println("Do you want to Continue (y/n)  :");
			choice = sc.next();
		}

		while (choice.equalsIgnoreCase("y"));

	}

}

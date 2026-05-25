package com.cts.collections;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountService bservice = new BankAccountServiceImpl();

		bservice.addBankAccount(new BankAccount(1, "A", 10000));
		bservice.addBankAccount(new BankAccount(2, "B", 50000));
		bservice.addBankAccount(new BankAccount(3, "C", 80000));
		bservice.addBankAccount(new BankAccount(4, "D", 40000));
		bservice.addBankAccount(new BankAccount(5, "E", 90000));

		List<BankAccount> list = bservice.showAllAccounts();

		for (BankAccount acc : list)
			System.out
					.println(acc.getAccountNumber() + "    " + acc.getCustomerName() + "  " + acc.getAccountBalance());

		BankAccount temp = new BankAccount(1, "xxxxx", 230000);

		bservice.updateBankAccount(temp);

		System.out.println("After updated Bank Account details are ");

		list = bservice.showAllAccounts();
		for (BankAccount acc : list)
			System.out
					.println(acc.getAccountNumber() + "    " + acc.getCustomerName() + "  " + acc.getAccountBalance());

		BankAccount temp1 = new BankAccount(1, "Rohit", 222222);
		bservice.removeBankAccount(temp1);

		System.out.println("After Remove Bank Account details are ");

		list = bservice.showAllAccounts();

		for (BankAccount acc : list)
			System.out
					.println(acc.getAccountNumber() + "    " + acc.getCustomerName() + "  " + acc.getAccountBalance());

	}

}

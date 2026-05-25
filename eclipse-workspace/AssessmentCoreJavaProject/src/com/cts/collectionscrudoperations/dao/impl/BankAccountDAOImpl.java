package com.cts.collectionscrudoperations.dao.impl;

import java.util.LinkedList;
import java.util.List;

import com.cts.collections.AccountNotFoundException;
import com.cts.collections.BankAccount;
import com.cts.collectionscrudoperations.dao.BankAccountDAO;

public class BankAccountDAOImpl implements BankAccountDAO {

	List<BankAccount> accountList = new LinkedList<>();

	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		accountList.add(bankAccount);
	}

	public void removeBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		try {
			if (!accountList.contains(bankAccount))
				throw new AccountNotFoundException(bankAccount.getAccountNumber());

		} catch (AccountNotFoundException ae) {
			System.out.println(ae);
		}
		accountList.remove(bankAccount);
	}

	public void updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		try {
			if (!accountList.contains(bankAccount))
				throw new AccountNotFoundException(bankAccount.getAccountNumber());

		} catch (AccountNotFoundException ae) {
			System.out.println(ae);
		}

		int index = accountList.indexOf(bankAccount);
		accountList.set(index, bankAccount);

	}

	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub

		return accountList;
	}

}

package com.cts.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.dao.BankAccountDAO;
import com.cts.model.BankAccount;

public class BankAccountDAOImpl implements BankAccountDAO {

	List<BankAccount> accountList = new ArrayList<>();

	@Override
	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		accountList.add(bankAccount);

	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub
		return accountList;
	}

}

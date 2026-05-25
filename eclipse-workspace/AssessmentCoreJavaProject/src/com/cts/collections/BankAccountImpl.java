package com.cts.collections;

import java.util.LinkedList;
import java.util.List;

public class BankAccountImpl implements BankAccountDAO {

	List<BankAccount>accountList=new LinkedList<>();
	
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		accountList.add(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		try
		{
		if(!accountList.contains(bankAccount))
			throw new AccountNotFoundException(bankAccount.getAccountNumber());
		
		}
		catch(AccountNotFoundException ae)
		{
			System.out.println(ae);
		}
		accountList.remove(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		try
		{
		if(!accountList.contains(bankAccount))
			throw new AccountNotFoundException(bankAccount.getAccountNumber());
		
		}
		catch(AccountNotFoundException ae)
		{
			System.out.println(ae);
		}

		int index=accountList.indexOf(bankAccount);
		accountList.set(index, bankAccount);
		

	}

	@Override
	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub

		return accountList;
	}

}

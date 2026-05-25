package com.cts.collections;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {

	
	BankAccountDAO bdao=new BankAccountImpl();
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		bdao.addBankAccount(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		bdao.removeBankAccount(bankAccount);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub

		bdao.updateBankAccount(bankAccount);
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		// TODO Auto-generated method stub
		
		return bdao.showAllAccounts();
	}

}

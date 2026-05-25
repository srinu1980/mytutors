package com.cts.collections;

import java.util.List;

public interface BankAccountDAO
{

	public abstract void addBankAccount(BankAccount bankAccount);
	public abstract void removeBankAccount(BankAccount bankAccount);
	public abstract void updateBankAccount(BankAccount bankAccount);
	public abstract List<BankAccount> showAllAccounts();
}

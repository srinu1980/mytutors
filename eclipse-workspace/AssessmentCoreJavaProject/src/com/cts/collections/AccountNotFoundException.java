package com.cts.collections;

public class AccountNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accNumber;

	public AccountNotFoundException() {
		super();

	}

	@Override
	public String toString() {
		return "AccountNotFoundException [accNumber=" + accNumber + "]";
	}

	public AccountNotFoundException(int accNumber) {
		super();
		this.accNumber = accNumber;
	}

}

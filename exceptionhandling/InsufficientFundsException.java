package com.cts.exceptionhandling;

//Create CUSTOM Exception

public class InsufficientFundsException extends Exception
{

	private double amount;
	
	public InsufficientFundsException(double amount)
	{
		this.amount=amount;
	}

	public double getAmount() {
		return amount;
	}
	
	/*
	public String toString()
	{
		return +amount+" InsufficientFundException Occured !";
	}
	*/
}

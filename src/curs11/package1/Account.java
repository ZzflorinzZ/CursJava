package curs11.package1;

import homeworkCurs10.InsuficientFundsException;

public abstract class Account {
	
	public abstract void deposit(double amount) throws InvalidAmountException;
	public abstract void withdraw(double amount) throws InsuficientFundsException, InvalidAmountException;
	public abstract void checkBalance();
		
}

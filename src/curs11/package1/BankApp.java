package curs11.package1;

import java.util.Scanner;

import homeworkCurs10.InsuficientFundsException;

/*
 * simulam o aplicatie bancara care sa permita depunere, retragere si verificare sold
 * informam userul ce operatiuni sunt disponibile
 * intrebm userul ce operatiune vrea sa foloseasca
 * procesam operatiunea
 * intrebam daca vrea sa continue sau nu
 * 
 * 1 interfata pt account
 * 1 clasa pt CurrentAccount
 * 1 clasa de executie (BankApp)
 * clase de exceptii
 * 
 */

public class BankApp {
	
	public static void bankApp(CurrentAccount account) throws InvalidAmountException, InsuficientFundsException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Available operations are:");
		System.out.println("1 Deposit");
		System.out.println("2 Withraw");
		System.out.println("3 Check balance");
		String option = scan.next();
		
		switch(option) {
		case "1":
			System.out.println("Please enter deposit amount:");
			account.deposit(getAmount());
			account.checkBalance();
			break;
		case "2":
			System.out.println("Please enter withdraw amount:");
			account.withdraw(getAmount());
			account.checkBalance();
			break;
		case "3":
			account.checkBalance();
			break;
		default:
			System.out.println("Invalid option!");
		}
		
		System.out.println("Do you want to continue? yes or no");
		String userResponse = scan.next();
		
		if(userResponse.equalsIgnoreCase("yes")) {
			bankApp(account); //recursion
		}
	}
	
	public static double getAmount() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	public static void main(String[] args) throws InvalidAmountException, InsuficientFundsException {
		
		CurrentAccount obj = new CurrentAccount();		
		
		bankApp(obj);
	} 

}

package homeworkCurs10;

import java.util.Scanner;

import curs10.InvalidAgeException;

public class TestSavingsAccount {
	
	
	public static void thankYou() {
		System.out.println("Thank you for using our ATM!");
	}
	
	public static void main(String[] args) throws InsuficientFundsException {
		
		
		Customer client = new Customer("Costica", "de la tara", "costica@gmail.com");
		SavingsAccount cont = new SavingsAccount(88881111, 150, client);				// cumva a recunoscut accountOwner = client; nu prea imi dau seama cum
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi " + Customer.getName());				// a trebuit sa definesc variabila name statica pt a o putea chema pe getter
		System.out.println("Please enter the amount to withdraw");
		int withdrawAmount = scan.nextInt();
		
		
		try {
			cont.withdraw(withdrawAmount);
		}catch(InsuficientFundsException e) {
			System.out.println("The amount you entered is greater then the available balance: " + SavingsAccount.balance);
			thankYou();
		}
		System.out.println("Please pick up your money!");  
		System.out.println("Your new balance is: " + SavingsAccount.balance);  // a trebuit sa definesc variabila balance statica pt a o putea chema
		thankYou();
		
		
	}

}

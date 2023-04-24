package homeworkCurs10;

public class Account {
	
	private int accountNumber;
	public static double balance;
	public Customer accountOwner;
	

	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}


	public void withdraw(int withdrawAmount) throws InsuficientFundsException{
		if(withdrawAmount > balance) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}
	}
	

}

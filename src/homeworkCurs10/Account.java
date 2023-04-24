package homeworkCurs10;

public class Account extends Customer{
	
	private int accountNumber;
	public static double balance;
	public Customer accountOwner;
	

	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = new Customer(getName(), getAddress(), getEmail());
	}


	public void withdraw(int withdrawAmount) throws InsuficientFundsException{
		if(withdrawAmount > balance) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}
	}
	

}

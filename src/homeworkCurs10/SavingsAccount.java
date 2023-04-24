package homeworkCurs10;

public class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner); 	
	}
	
	@Override
	public void withdraw(int withdrawAmount) throws InsuficientFundsException{
		if(withdrawAmount > balance) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}else {
			balance = balance - withdrawAmount;
		}
	}

}

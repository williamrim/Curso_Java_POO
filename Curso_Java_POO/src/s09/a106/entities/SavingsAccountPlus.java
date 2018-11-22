package s09.a106.entities;

//Classes e métodos final

public class SavingsAccountPlus extends SavingsAccount {
	
	private double iof1;
	
	public SavingsAccountPlus(Integer number, String holder, double balance, Double interestRate, double iof) {
		super(number, holder, balance, interestRate);
		iof1 = iof;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount * iof1;
	}
	
	
}

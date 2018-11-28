package s09.a110.entities;

//Classes abstratas

public class SavingsAccount extends Account{
	
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//geralmente é bom definir a sobreposição como "final" para evitar inconsistências.
	@Override
	public /*final*/ void withdraw(double amount) {
		balance -= amount;
	}
}

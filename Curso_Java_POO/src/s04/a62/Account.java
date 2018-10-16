package s04.a62;

//Exercício de Fixação

public class Account {

	private int n;
	public String holder;
	private double withdrawFee = 5.0;
	private double balance;

	public Account(int n, String holder, double startDeposit) {
		this.n = n;
		this.holder = holder;
		this.balance = startDeposit;
	}

	public void Deposit(double value) {
		balance += value;
	}

	public void Withdraw(double value) {
		balance -= (value + withdrawFee);
	}

	public String toString() {
		return "Account " + n + ", Holder: " + holder + ", Balance: $ " + balance;
	}

}

package s10.a123.model.entities;

//Exercício de fixação

import s10.a119a120a121a122.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance, withdrawLimit;

	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double initialBalance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = initialBalance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceed withdraw limit.");
		} else if (amount > balance) {
			throw new DomainException("Not enough balance.");
		}

		balance -= amount;
	}

}

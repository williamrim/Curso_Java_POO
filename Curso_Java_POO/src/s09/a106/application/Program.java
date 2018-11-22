package s09.a106.application;

//Classes e métodos final

import s09.a106.entities.Account;
import s09.a106.entities.BusinessAccount;
import s09.a106.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(101, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}

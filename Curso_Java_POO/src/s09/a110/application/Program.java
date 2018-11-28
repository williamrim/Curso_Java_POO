package s09.a110.application;

//Classes abstratas

import java.util.ArrayList;
import java.util.List;
import s09.a110.entities.Account;
import s09.a110.entities.BusinessAccount;
import s09.a110.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0;
		for(Account acc : list	) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balande: %.2f\n", sum);
		
		for(Account acc : list	) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list	) {
			System.out.printf("update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
		}
		
				
	}

}

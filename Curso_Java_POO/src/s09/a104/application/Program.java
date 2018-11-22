package s09.a104.application;

//Upcasting e Downcasting

import s09.a104.entities.Account;
import s09.a104.entities.BusinessAccount;
import s09.a104.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
				
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		
		//acc2.loan(100.0);
		//Não compila, por ser um objeto da Classe Account e a função "loan" é da Classe BusinessAccount.
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//Não compila, por acc3 ter sido iniciado como SavingsAccount.
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println(acc.getNumber());
		System.out.println(acc1.getHolder());
		
	}

}

package s04.a64.application;

import java.util.Scanner;

import s04.a64.entitites.Account;

// Correção do Exercício de fixação

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println("\nAccount data:\n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:\n" + account);

		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:\n" + account);

		
		sc.close();
	}
}

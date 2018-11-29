package s10.a123.application;

//Exercício de fixação

import java.util.Scanner;

import s10.a119a120a121a122.model.exceptions.DomainException;
import s10.a123.model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.print("\nEnter amount for withdraw: ");
			double amount = sc.nextDouble();

			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error.");
		}

		sc.close();
	}

}

package s04.a62;

// Exercício de Fixação

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String holder;
		char startDepositAnswer;
		double startDeposit = 0;
		
		System.out.print("Enter account number: ");
		n = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		startDepositAnswer = sc.next().charAt(0);
		
				
		if(startDepositAnswer == 'y') {
			System.out.print("Enter initial deposit value: ");
			startDeposit = sc.nextDouble();
		}
		
		Account account = new Account(n, holder, startDeposit);
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		account.Deposit(sc.nextDouble());
		System.out.println("Updated account data:\n" + account);
		
		System.out.print("\nEnter a withdraw value: ");
		account.Withdraw(sc.nextDouble());;
		System.out.println("Updated account data:\n" + account);
		
		sc.close();
	}
}

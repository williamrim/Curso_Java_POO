package s09.a112.application;

//Exercício de fixação

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import s09.a112.entities.Company;
import s09.a112.entities.Individual;
import s09.a112.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of empolyees: ");
				int numberOfEmpolyees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmpolyees));
			}
		}
		
		double sum = 0;
		System.out.println("\nTAXES PAID:");
		for(TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.taxPaid()));
			sum += tp.taxPaid();
		}
		
		System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}

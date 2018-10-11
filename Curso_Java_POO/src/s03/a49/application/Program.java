package s03.a49.application;

//Exercício de Fixação

import java.util.Scanner;

import s03.a49.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double dollarPrice, quantityToBuy;

		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		quantityToBuy = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f",
				CurrencyConverter.totalReais(dollarPrice, quantityToBuy));

		sc.close();
	}

}

package s02.a37.course;

import java.util.Scanner;

// Estrutura repetitiva do-while

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.print("Enter a number: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);

			System.out.print("Repeat (y/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}

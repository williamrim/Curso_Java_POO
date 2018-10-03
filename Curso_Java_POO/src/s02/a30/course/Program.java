package s02.a30.course;

// Estrutura repetitiva while

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double n = sc.nextDouble();

		while (n >= 0.00) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative number.");

		sc.close();
	}

}

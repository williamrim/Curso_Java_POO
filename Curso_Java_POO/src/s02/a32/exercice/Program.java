package s02.a32.exercice;

// Estruturas repetitivas while e for

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}

		// System.out.printf("N positive!%nEnter %d integer numbers.%n", n);

		/*
		 * int higher = 0; for(int i = 1; i <= n; i++) {
		 * System.out.printf("Value #%d: ", i); int value = sc.nextInt();
		 * 
		 * if(i==1) { higher = value; } else { higher = (value > higher) ? value :
		 * higher; } }
		 */
		

		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.printf("Value #%d: ", i);
			int value = sc.nextInt();
			higher = (value > higher) ? value : higher;
		}

		System.out.println("Higher = " + higher);

		sc.close();
	}

}

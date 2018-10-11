package s03.a48.application;

// Membros estáticos - Parte 2

import java.util.Scanner;

import s03.a48.util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circunference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}

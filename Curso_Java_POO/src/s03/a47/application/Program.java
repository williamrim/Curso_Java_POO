package s03.a47.application;

import java.util.Scanner;

import s03.a47.util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circunference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}

}

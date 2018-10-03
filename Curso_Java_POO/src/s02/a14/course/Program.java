package s02.a14.course;

// Saída de dados em Java 

import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";

		// code snippets são úteis para agilizar a digitação.
		// tente "sysout" + Ctrl + Space

		System.out.println("Good mornig!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("------------------");
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		System.out.println("------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins.%n ", name, age, gender,
				balance);

	}
}

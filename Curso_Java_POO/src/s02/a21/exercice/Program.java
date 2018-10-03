package s02.a21.exercice;

//Entrada de dados em Java - Parte 2

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name:");
		// Alex Green
		String name = sc.nextLine();

		System.out.println("How many bedrooms are in your house?");
		// 3
		int bedrooms = sc.nextInt();

		System.out.println("Enter product price:");
		// 500.50
		double price = sc.nextDouble();

		System.out.println("Enter your last name, age and height (on the same line):");
		// Green 21 1.73
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);

		sc.close();

	}

}

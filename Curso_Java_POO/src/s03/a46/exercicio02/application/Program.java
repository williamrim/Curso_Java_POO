package s03.a46.exercicio02.application;

//Exercícios de fixação

import java.util.Scanner;

import s03.a46.exercicio02.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println("\nEmployee: " + emp);

		System.out.print("\nWich percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());

		System.out.println("\nUpdated data: " + emp);

		sc.close();
	}

}

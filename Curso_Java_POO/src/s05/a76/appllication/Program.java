package s05.a76.appllication;

//Exercício Proposto


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import s05.a76.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println("\nEmployee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println("\nList of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
	

		sc.close();
	}

}
}

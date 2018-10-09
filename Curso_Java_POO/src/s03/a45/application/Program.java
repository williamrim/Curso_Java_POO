package s03.a45.application;

// Finalizando o programa

import java.util.Scanner;

import s03.a45.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();

		System.out.print("\nProduct data: " + product);

		System.out.print("\nEnter the number od products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.print("\nUpdated data: " + product);

		System.out.print("\nEnter the number od products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.print("\nUpdated data: " + product);

		sc.close();
	}

}

package s08.a100.application;

//Exercício de fixação
//refeito para melhor fixação

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import s08.a100.entities.Client;
import s08.a100.entities.Order;
import s08.a100.entities.OrderItem;
import s08.a100.entities.OrderStatus;
import s08.a100.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYY): ");
		Date birthDate = sdf.parse(sc.nextLine());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());

		System.out.print("How many items to this order? ");
		int items = sc.nextInt();

		Order order = new Order(new Date(), status, client);

		for (int i = 0; i < items; i++) {
			System.out.print("Enter #" + (i + 1) + " item data:");
			System.out.print("\nProduct name: ");
			String itemName = sc.next();

			System.out.print("Product price: ");
			double itemPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			order.addItem(new OrderItem(quantity, new Product(itemName, itemPrice)));
		}

		System.out.println("\nORDER SUMMARY");
		System.out.println(order);

		sc.close();
	}

}

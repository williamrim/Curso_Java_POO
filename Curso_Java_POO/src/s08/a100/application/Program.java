package s08.a100.application;

//Exercício de fixação

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

import s08.a100.entities.Client;
import s08.a100.entities.Order;
import s08.a100.entities.OrderItem;
import s08.a100.entities.Product;
import s08.a100.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, new Client(name, email, birthDate));
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		
		for (int i =0; i<items; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			order.addItems(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));			
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}

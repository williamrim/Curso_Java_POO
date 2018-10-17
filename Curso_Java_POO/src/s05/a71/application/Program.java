package s05.a71.application;

//Exercício de Fixação

import java.util.Scanner;

import s05.a71.entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<rooms;i++) {
			System.out.print("\nRent #" + (i+1) + ":");
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rent[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i=0; i<rent.length;i++) {
			if(rent[i] != null) {
				System.out.printf("%d: %s, %s\n", i, rent[i].getName(), rent[i].getEmail());
			}
		}
				
		sc.close();

	}

}

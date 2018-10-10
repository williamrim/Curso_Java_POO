package s03.a46.exercicio01.application;

// Exercícios de fixação

import java.util.Scanner;

import s03.a46.exercicio01.entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println(rec);
		
		sc.close();		
	}

}

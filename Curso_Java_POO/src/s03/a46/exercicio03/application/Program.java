package s03.a46.exercicio03.application;

//Exercícios de fixação

import java.util.Scanner;

import s03.a46.exercicio03.entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student std1 = new Student();
		Student std2 = new Student();

		std1.Name = sc.nextLine();
		std1.trimester1 = sc.nextDouble();
		std1.trimester2 = sc.nextDouble();
		std1.trimester3 = sc.nextDouble();

		std1.situation();
		
		System.out.println();
		
		sc.nextLine();
		std2.Name = sc.nextLine();
		std2.trimester1 = sc.nextDouble();
		std2.trimester2 = sc.nextDouble();
		std2.trimester3 = sc.nextDouble();

		std2.situation();

	}

}

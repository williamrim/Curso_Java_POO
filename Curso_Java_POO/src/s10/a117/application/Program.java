package s10.a117.application;

//Pilha de chamadas de métodos

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("\nEnd of Program.");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");		
	}
	
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

/*
 * Erro tradado
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		// Caso digite um valor do vetor que não exista.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			
			//imprime o rastreio das chamadas do erro (Pilha de chamadas de métodos)
			e.printStackTrace();
			sc.next();
		}

		// caso digite um caractere digerente de número
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
*/
		
//Programa sem tratar o erro /*
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
// */
		System.out.println("***METHOD2 END***");
		sc.close();
	}
}

package s10.a116.application;

//Estrutura try-catch

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		
		//Caso digite um valor do vetor que não exista.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
		}
		
		//caso digite um caractere digerente de número
		catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("Fim do Programa.");
		
		sc.close();
	}

}

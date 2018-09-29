package s02.a23.exercice;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Write 3 numbers:");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int d = 0;

		System.out.printf("Numbers: %d, %d, %d.%n", n1, n2, n3);

		if (n1 >= n2) {
			if (n1 >= n3) {
				d = n1;
			}
		} else if (n2 >= n3) {
			d = n2;
		} else {
			d = n3;
		}
		System.out.printf("The higer number is: %d", d);

		sc.close();
	}

}

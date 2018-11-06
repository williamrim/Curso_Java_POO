package s05.a79.application;

//Exercício proposto

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int m, n;

		// escanear o número de Linhas M e Colunas N
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();

		// criar a matriz MN

		int[][] mat = new int[m][n];

		// escanear todos os valores inteiros da matriz MN

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// escanear um número inteiro X que pertença à matriz

		int x = sc.nextInt();

		// mostrar a posição deste número X na matriz MN
		// mostrar qual o valor das posições imediatamente esquerda, direita, acima e
		// abaixo.
		// se não houver alguma posição, não mostrar nada.

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("\nPosition " + i + "," + j);

					int left = j - 1;
					if (left >= 0) {
						System.out.println("Left: " + mat[i][left]);
					}

					int right = j + 1;
					if (right < n) {
						System.out.println("Right: " + mat[i][right]);
					}

					int up = i - 1;
					if (up >= 0) {
						System.out.println("Up: " + mat[up][j]);
					}

					int down = i + 1;
					if (down < m) {
						System.out.println("Up: " + mat[down][j]);
					}
					
/*
*Modo mais simples
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
*/					
				}
			}
		}

		sc.close();
	}

}

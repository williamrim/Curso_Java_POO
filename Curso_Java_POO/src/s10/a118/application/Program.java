package s10.a118.application;

//Bloco Finally

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("/home/wil/.temp/in.txt"); // caminho para o arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed.");
		}

	}

}

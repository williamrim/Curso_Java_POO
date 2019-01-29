package s12.a160.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternon", "Good night"};
		
		String path = "/temp/Curso_Java_POO.s12/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}

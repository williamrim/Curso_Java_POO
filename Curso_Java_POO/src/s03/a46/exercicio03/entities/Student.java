package s03.a46.exercicio03.entities;

// Exercícios de fixação

/*
 * Student
 * ---------------------
 * - Name: string
 * - trimester1: double
 * - trimester2: double
 * - trimester3: double
 * ---------------------
 * + Situation(): void
 */

public class Student {
	
	public String Name;
	public double trimester1, trimester2, trimester3;
	
	public void situation() {
		double finalGrade = trimester1 + trimester2 + trimester3;
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		
		if(finalGrade <= 60.00) {
			System.out.println("FAILED");
			double missing = 60.00 - finalGrade;
			System.out.println("MISSING " + missing + " POINTS");
		}
		else{
			System.out.println("PASS");
		}
	}

}

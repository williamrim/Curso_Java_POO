package s02.a16.course;

// Operadores de atribuição 

public class Program02 {

	public static void main(String[] args) {

		int a = 10;
		System.out.printf("a = %d%n", a);
		int b = a++; //incrementa "a" depois de incrementar "b"
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		
		int c = 100;
		System.out.printf("c = %d%n", c);
		int d = ++c; //incrementa "c" antes de incrementar "d"
		System.out.printf("c = %d%n", c);
		System.out.printf("d = %d%n", d);
		
		
	}

}

package s03.a42.entities;

// Criando um método para obtermos os benefícios de reaproveitamento e delegação 

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}

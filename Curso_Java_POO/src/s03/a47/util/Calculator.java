package s03.a47.util;

//Membros estáticos - Parte 1

public class Calculator {

	public double PI = 3.14159;

	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}
}

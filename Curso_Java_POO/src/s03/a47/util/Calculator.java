package s03.a47.util;

public class Calculator {

	public double PI = 3.14159;

	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}
}

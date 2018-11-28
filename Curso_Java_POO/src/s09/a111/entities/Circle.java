package s09.a111.entities;

//Métodos abstratos

import s09.a111.entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle() {
		super();
	}
			
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}

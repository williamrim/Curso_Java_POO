package s05.a76.entities;

//Exercício Proposto

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary *= (1 + (percentage / 100));
	}

	public String toString() {
		return String.format("%d", this.id) + ", " + this.name + ", " + String.format("%.2f", this.salary);
	}
}

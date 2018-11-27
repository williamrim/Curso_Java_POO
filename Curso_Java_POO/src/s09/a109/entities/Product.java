package s09.a109.entities;

//Exercício de fixação

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String priceTag() {
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append(this.getName());
		 * sb.append(" $ " ); sb.append(String.format("%.2f", this.getPrice()));
		 * sb.append("\n") return sb.toString();
		 */
		return name + " $ " + String.format("%.2f", price);
	}

}

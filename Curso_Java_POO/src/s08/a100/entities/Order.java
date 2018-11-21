package s08.a100.entities;

//Exercício de fixação
//refeito para melhor fixação

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> order = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrder() {
		return order;
	}

	public void addItem(OrderItem item) {
		order.add(item);
	}
	
	public void remove(OrderItem item) {
		order.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for (OrderItem item : order) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment));
		sb.append("\nOrder status: ");
		sb.append(status);
		sb.append("\nClient: ");
		sb.append(client);
		sb.append("\nOrder Items:\n");
		for (OrderItem item : order) {
			sb.append(item);
			sb.append("\n");
		}
		sb.append("Totam price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}

}

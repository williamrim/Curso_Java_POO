package s08.a100.entities;

//Exercício de fixação

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import s08.a100.entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		super();
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

	public OrderStatus getstatus() {
		return status;
	}

	public void setOstatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems(){
		return items;
	}
	
	public void addItems(OrderItem item) {
		items.add(item);
	}
	
	public void removeItems(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+ sdf.format(moment));
		sb.append("\nOrderstatus: " + status);
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:");
		for (OrderItem item : items) {
			sb.append("\n" + item);
		}
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
	
	
	
}

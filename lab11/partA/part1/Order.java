package partA.part1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderId;
	private LocalDate dateOfOrder;
	private List<OrderItem> orderItems;
	public Order(LocalDate date, String orderId, String itemid, int quantity, int price) {
		this.orderId = orderId;
		dateOfOrder = date;
		orderItems = new ArrayList<>();
		//an order requires at least one order item
		addOrderItem(itemid, quantity, price);
	}
	public void addOrderItem(String id, int quantity, int price) {
		orderItems.add(new OrderItem(id, quantity, price));
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	@Override
	public String toString() {
		return "\n\nOrder: \n" 
		  +  " order date: " + dateOfOrder + "\n"
		  +  " order items: \n" 
		  +  " " + orderItems;
	}
}

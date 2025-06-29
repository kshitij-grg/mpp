package prob4.extpackage;

import prob4.CustOrderFactory;
import prob4.Customer;
import prob4.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomerOrder("Bob");
		Order order = CustOrderFactory.newOrder(cust,LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.newOrder(cust,LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getName());
		for (Order o: cust.getOrders()){
			System.out.println(o);
		}
	}
}

		

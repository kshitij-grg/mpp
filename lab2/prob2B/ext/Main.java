package prob2B.ext;

import prob2B.Order;
import prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("O111");
        OrderLine orderLine = order.addOrderLine();

        System.out.println("Order No of " + order.getOrderNum() + " order " + orderLine + " added.");
    }
}

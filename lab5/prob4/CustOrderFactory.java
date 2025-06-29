package prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomerOrder(String name) {
        return new Customer(name);
    }

    public static Order newOrder(Customer cust, LocalDate date) {
        if (cust == null) throw new NullPointerException("Null customer");
        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }
}

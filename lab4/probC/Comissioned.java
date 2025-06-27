package probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Comissioned extends Employee {
    private double commission, baseSalary;
    private List<Order> orders;

    public Comissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double total = 0;
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year) {
                total += order.getOrderAmount();
            }
        }
        return baseSalary + ((commission / 100) * total);
    }
}

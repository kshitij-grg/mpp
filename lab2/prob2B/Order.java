package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLineList;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLineList = new ArrayList<>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public OrderLine addOrderLine(){
        OrderLine orderLine = new OrderLine(this);
        orderLineList.add(orderLine);
        return orderLine;
    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

public class Chief extends Worker{
    public List<Order> orderList = new ArrayList<>();
    public List<Order> finishedOrders = new ArrayList<>();

    public Chief() {
        super();
    }

    @Override
    public void takeOrder(Order order) {
        this.orderList.add(order);
    }

    public void makingOrder() {
        if (this.orderList.isEmpty()) return;
        Order currentOrder = this.orderList.get(0);
        System.out.println("Now i'm processing order " + currentOrder.self_id);
        this.orderList.remove(currentOrder);
        this.finishedOrders.add(currentOrder);
        this.notify(currentOrder.self_id);
    }

    @Override
    public void getOrder(Integer orderId) {
        Order order = null;
        for (Order order1 : this.finishedOrders) {
            if (order1.self_id == orderId) {
                order = order1;
                break;
            }
        }
        this.finishedOrders.remove(order);
    }
}

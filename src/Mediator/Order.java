package Mediator;

public class Order {
    static int id = 1;
    private int self_id;
    private OrderType orderType;

    public Order(OrderType orderType) {
        this.orderType = orderType;
        this.self_id = Order.id;
        Order.id += 1;
    }

    public int getSelf_id() {
        return self_id;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "self_id=" + self_id +
                ", orderType=" + orderType +
                '}';
    }
}

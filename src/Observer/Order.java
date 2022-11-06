package Observer;

public class Order {
    public static int id = 1;
    public int self_id;
    public OrderType orderType;

    public Order(OrderType orderType) {
        this.orderType = orderType;
        this.self_id = Order.id;
        Order.id += 1;
    }

    @Override
    public String toString() {
        return "Order{" +
                "self_id=" + self_id +
                ", orderType=" + orderType +
                '}';
    }
}

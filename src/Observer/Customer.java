package Observer;

public class Customer extends Observer {
    public String name;
    public Chief chief;
    public Order order;

    public Customer(String name, Chief chief) {
        this.name = name;
        this.chief = chief;
    }

    @Override
    public void update(Integer orderId) {
        if (this.order.self_id == orderId) {
            this.chief.getOrder(this.order.self_id);
            System.out.println(this.name + " has got order and is glad!");
//            this.chief.deleteObserver(this);
        }
    }

    public void addOrder(Order order){
        this.order = order;
        this.chief.takeOrder(order);
        this.chief.addObserver(this);
    }
}

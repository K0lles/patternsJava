package Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class IWorker {
    private String name;
    private List<Order> orders = new ArrayList<>();
    private IMediator mediator;

    public IWorker(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.addWorker(this);
    }

    public abstract WorkerType type();

    public void takeOrder(Order order) {
        this.orders.add(order);
        System.out.println(this.type() + " " + this.name + " has accepted your " + order + " and is going to execute it");
    }

    public void finishOrder(Order order) {
        try {
            this.orders.remove(order);
            System.out.println(this.type().name() + " " + this.name + "has done order " + order);
        }
        catch (Exception e) {
            System.out.println("Sorry, but " + this.type() + " " + this.name + " do not have " + order);
        }
    }
}

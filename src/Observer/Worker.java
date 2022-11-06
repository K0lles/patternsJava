package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Worker {
    private List<Observer> observerList = new ArrayList<>();

    public Worker() {
    }

    public abstract void takeOrder(Order order);

    public void addObserver(Observer observer) {
        if (!this.observerList.contains(observer)) this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public abstract void getOrder(Integer orderId);

    public void notify(Integer orderId) {
        for (Observer observer : this.observerList) {
            observer.update(orderId);
        }
    }
}

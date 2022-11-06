package Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantMediator extends IMediator{
    private HashMap<WorkerType, List<IWorker>> workers = new HashMap<>() {{
        put(WorkerType.WAITER, new ArrayList<>());
        put(WorkerType.BARMAN, new ArrayList<>());

    }};

    public RestaurantMediator() {
    }

    @Override
    public void addWorker(IWorker worker) {
        this.workers.get(worker.type()).add(worker);
    }

    @Override
    public void execute(Order order, Action action) {
        if (action == Action.GET_ORDER) {
            if (order.getOrderType() == OrderType.FOOD) this.workers.get(WorkerType.WAITER).get(0).takeOrder(order);
            else  this.workers.get(WorkerType.BARMAN).get(0).takeOrder(order);
        }
        else {
            if (order.getOrderType() == OrderType.FOOD) this.workers.get(WorkerType.WAITER).get(0).finishOrder(order);
            else this.workers.get(WorkerType.BARMAN).get(0).finishOrder(order);
        }
    }
}

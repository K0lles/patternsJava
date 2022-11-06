package Mediator;

import java.util.List;

public class Waiter extends IWorker{

    public Waiter(String name, IMediator mediator) {
        super(name, mediator);
    }

    @Override
    public WorkerType type() {
        return WorkerType.WAITER;
    }
}

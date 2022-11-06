package Mediator;

import java.util.List;

public class Barman extends IWorker{

    public Barman(String name, IMediator mediator) {
        super(name, mediator);
    }

    @Override
    public WorkerType type() {
        return WorkerType.BARMAN;
    }
}

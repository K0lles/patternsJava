package Mediator;

public abstract class IMediator {

    public abstract void addWorker(IWorker worker);

    public abstract void execute(Order order, Action action);

}

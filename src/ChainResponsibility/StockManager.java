package ChainResponsibility;

public class StockManager extends Handler {
    private Handler successor;

    public StockManager(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void serve(Action customerNeed) {
        System.out.println("Customer action " + customerNeed.name() + " is starting processing by Manager of Stock");
        System.out.println("Manager has made this order and in the nearest future it will be delivered");
    }
}

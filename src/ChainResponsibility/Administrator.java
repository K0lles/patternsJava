package ChainResponsibility;

public class Administrator extends Handler {
    private Handler successor;

    public Administrator(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void serve(Action customerNeed) {
        System.out.println("Customer action " + customerNeed.name() + " is starting processing by Administrator");
        if (this.checkOperation(customerNeed))System.out.println("Customer got the answer on his question");
        System.out.println("This operation cannot be executed by Administrator. Giving it to other participant");
        this.successor.serve(customerNeed);
    }

    private boolean checkOperation(Action action) {
        return action == Action.QUESTION;
    }
}

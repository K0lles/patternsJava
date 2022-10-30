package Decorator;

public class FacebookDecorator extends IDecorator{
    private INotifier notifier;

    public FacebookDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String sendNotification() {
        return "Facebook... " + this.notifier.sendNotification();
    }
}

package Decorator;

public class PhoneDecorator extends IDecorator{
    private INotifier notifier;

    public PhoneDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String sendNotification() {
        return "Phone SMS... " + this.notifier.sendNotification();
    }
}

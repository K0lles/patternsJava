package Decorator;

public class Notifier extends INotifier{
    private String textMessage;

    public Notifier(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String sendNotification() {
        return "Pizeria Palmonelo! " + this.textMessage;
    }
}

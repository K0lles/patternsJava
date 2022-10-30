package FlyWeight;

public class Flyweight {
    private Shared shared;

    public Flyweight(Shared shared) {
        this.shared = shared;
    }

    public void process(Unique unique) {
        System.out.println("New data: common - " + this.shared.getCompany() + ", " + this.shared.getPosition() +
                "; unique - " + unique.getName() + ", " + unique.getPassport());
    }

    public String getData() {
        return this.shared.getCompany() + ", " + this.shared.getPosition();
    }
}

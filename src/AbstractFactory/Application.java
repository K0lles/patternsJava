package AbstractFactory;

public class Application {
    private AbstractFactory factory;

    public Application(AbstractFactory factory) {
        this.factory = factory;
    }

    public void getFourCheesesPizza() {
        this.factory.getFourCheesesPizza().create();
    }

    public void getMargaritaPizza() {
        this.factory.getMargaritaPizza().create();
    }
}

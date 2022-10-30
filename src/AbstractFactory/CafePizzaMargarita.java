package AbstractFactory;

public class CafePizzaMargarita extends AbstractPizzaMargarita {

    public CafePizzaMargarita() {
        super("Cafe");
    }

    @Override
    public void create() {
        System.out.println("Margarita Pizza was created for " + this.getInstitution());
    }
}

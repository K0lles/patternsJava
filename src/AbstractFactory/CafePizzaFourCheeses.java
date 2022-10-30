package AbstractFactory;

import Factory.PizzaFourCheeses;

public class CafePizzaFourCheeses extends AbstractPizzaFourCheeses {
    public CafePizzaFourCheeses() {
        super("Cafe");
    }

    @Override
    public void create() {
        System.out.println("Four Cheeses Pizza was created for " + this.getInstitution());
    }
}

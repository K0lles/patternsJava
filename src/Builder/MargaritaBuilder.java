package Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargaritaBuilder extends AbstractBuilder {
    private Pizza pizza;

    public MargaritaBuilder() {
        this.pizza = new Pizza("Margarita");
    }

    @Override
    public void setDough() {
        this.pizza.setDough(Dough.WHEAT);
    }

    @Override
    public void setCheese() {
        List<Cheese> cheeses = new ArrayList<Cheese>(Arrays.asList(Cheese.DUTCH, Cheese.MOZZARELLA));
        this.pizza.setCheeses(cheeses);
    }

    @Override
    public void setMeat() {
        List<Meat> meats = new ArrayList<Meat>(Arrays.asList(Meat.BACON, Meat.HAM));
        pizza.setMeats(meats);
    }

    @Override
    public Pizza getPizza() {
        this.setDough();
        this.setMeat();
        this.setCheese();
        return pizza;
    }
}

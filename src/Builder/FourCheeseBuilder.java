package Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourCheeseBuilder extends AbstractBuilder{
    private Pizza pizza;

    public FourCheeseBuilder() {
        this.pizza = new Pizza("Four Cheese");
    }

    @Override
    public void setDough() {
        this.pizza.setDough(Dough.CORN);
    }

    @Override
    public void setCheese() {
        List<Cheese> cheeses = new ArrayList<Cheese>(Arrays.asList(Cheese.DUTCH, Cheese.MOZZARELLA, Cheese.PARMESAN));
        this.pizza.setCheeses(cheeses);
    }

    @Override
    public void setMeat() {
        List<Meat> meats = new ArrayList<>();
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

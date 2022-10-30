package AbstractFactory;

public class RestaurantFactory extends AbstractFactory{
    @Override
    public AbstractPizzaFourCheeses getFourCheesesPizza() {
        return new RestaurantPizzaFourCheeses();
    }

    @Override
    public AbstractPizzaMargarita getMargaritaPizza() {
        return new RestaurantPizzaMargarita();
    }
}

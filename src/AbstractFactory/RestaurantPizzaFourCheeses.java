package AbstractFactory;

public class RestaurantPizzaFourCheeses extends AbstractPizzaFourCheeses{
    public RestaurantPizzaFourCheeses() {
        super("Restaurant");
    }

    @Override
    public void create() {
        System.out.println("Four Cheeses Pizza was created for " + this.getInstitution());
    }
}

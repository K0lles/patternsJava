package AbstractFactory;

public class RestaurantPizzaMargarita extends AbstractPizzaMargarita{
    public RestaurantPizzaMargarita() {
        super("Restaurant");
    }

    @Override
    public void create() {
        System.out.println("Margarita Pizza was created for " + this.getInstitution());
    }
}

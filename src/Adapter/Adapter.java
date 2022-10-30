package Adapter;

public class Adapter extends Pizza {
    private Pizza pizza;

    public Adapter(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getInfo() {
        return "{ 'name': " + pizza.getName() + ", 'price': " + pizza.getPrice() + " }";
    }
}

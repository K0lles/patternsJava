package Adapter;

public class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String geInfo() {
        return "<name>" + name + "</name>" + "<price>" + price + "</price>";
    }
}

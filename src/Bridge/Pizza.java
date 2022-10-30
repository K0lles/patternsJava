package Bridge;

import java.util.List;

public abstract class Pizza {
    private String name;
    private double price;
    private List<String> listTop;
    private Boolean isBaked;

    public Pizza(String name, double price, List<String> listTop) {
        this.name = name;
        this.price = price;
        this.listTop = listTop;
        this.isBaked = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getListTop() {
        return listTop;
    }

    public Boolean getBaked() {
        return isBaked;
    }

    public void setBaked(Boolean baked) {
        isBaked = baked;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", listTop=" + listTop +
                ", isBaked=" + isBaked +
                '}';
    }
}

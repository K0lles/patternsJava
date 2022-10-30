package Composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends IItem{
    private String name;
    private List<IItem> items = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void addItem(List<IItem> newList) {
        this.items.addAll(newList);
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double allPrice = 0.0;
        for(IItem item : this.items) {
            allPrice += item.getPrice();
        }
        return allPrice;
    }
}

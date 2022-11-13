package TemplateMethod;

import java.util.Arrays;

public class FourCheesesMaker extends PizzaMaker{

    public FourCheesesMaker() {
        super();
    }

    public void addDough() {
        this.characteristics.add("thin");
    }

    public void addSauce() {
        this.characteristics.add("mayonnaise");
    }

    public void addTopping() {
        this.characteristics.addAll(Arrays.asList("cheese", "parmezan", "mozzarella", "chedar"));
    }
}

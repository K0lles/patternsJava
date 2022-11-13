package TemplateMethod;

import Composite.Pizza;

import java.util.Arrays;

public class MargaritaMaker extends PizzaMaker {
    public MargaritaMaker() {
        super();
    }

    public void addDough() {
        this.characteristics.add("thin");
    }

    public void addSauce() {
        this.characteristics.add("ketchup and taco");
    }

    public void addTopping() {
        this.characteristics.addAll(Arrays.asList("cheese", "tomato"));
    }
}

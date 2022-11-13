package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PizzaMaker {
    public List<String> characteristics;

    public PizzaMaker() {
        this.characteristics = new ArrayList<>();
    }

    public void makePizza() {
        System.out.println("Increasing temperature in oven");
        System.out.println("Putting your pizza into over!");
        System.out.println("Ready, " + this.characteristics);
    }
}

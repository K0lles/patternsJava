package Facade;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    public static List<Product> products = new ArrayList<>();

    public static void addProductToStock(Product product) {
        Stock.products.add(product);
    }

    public static void removeProductFromStock(Product product) {
        Stock.products.remove(product);
    }
}

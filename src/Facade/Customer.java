package Facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> productList = new ArrayList<>();

    public Customer(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public void addProducts(List<Product> productList) {
        this.productList.addAll(productList);
    }

    public List<Product> orderProducts() {
        List<Product> orderedProducts = new ArrayList<Product>();
        Administrator.acceptCall();
        for (Product product : this.productList) {
            Product sentProduct = Administrator.sendProductToCustomer(product.getName());
            if (sentProduct != null) orderedProducts.add(sentProduct);
        }

        return orderedProducts;
    }
}

package Facade;

public class ManagerOfStock {

    static Product findProductOnStock(String name) {
        for (Product product: Stock.products) {
            if(product.getName() == name) return product;
        }
        return null;
    }
}

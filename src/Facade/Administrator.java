package Facade;

public class Administrator {

    static void acceptCall() {
        System.out.println("Good morning, how can I help you?");
    }

    static Product askForProduct(String name) {
        return ManagerOfStock.findProductOnStock(name);
    }

    static Product sendProductToCustomer(String name) {
        Product product = Administrator.askForProduct(name);
        if (product != null) {
            BankBill.pay(product);
            return product;
        }
        System.out.println("Your product is not in stock :(");
        return null;
    }
}

package Facade;

public class BankBill {
    static double bill = 100.0;

    public static void pay(Product product) {
        BankBill.bill = BankBill.bill - product.getPrice();
    }
}

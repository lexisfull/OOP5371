import VendingMachine.Domain.Bottle;
import VendingMachine.Domain.PrType;
import VendingMachine.Domain.Product;
import VendingMachine.Service.CoinDispancer;
import VendingMachine.Service.Holder;
import VendingMachine.Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrType prType = new PrType("Snack");
        Product product1 = new Product("Snikers", 33.45, prType) ;
        Product product2 = new Product("Nuts", 10.15, prType) ;
        Product product3 = new Product("Lays", 99.99, prType) ;
        Bottle bottle = new Bottle("Aqua", 88.0, 0.5);
//        System.out.println(product);

        List<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle);



        Holder holder = new Holder();
        CoinDispancer coinDispancer = new CoinDispancer();
        VendingMachine vendingMachine = new VendingMachine(holder, coinDispancer, products);
        for (Product prod: vendingMachine.getProductList()) {
            System.out.println(prod);
        }
    }
}
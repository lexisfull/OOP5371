package VendingMachine.Actor;

import VendingMachine.Domain.Bottle;
import VendingMachine.Domain.HotDrink;
import VendingMachine.Domain.PrType;
import VendingMachine.Domain.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  abstract class Shop implements Iterable<Product>{
    private static List<Product> products;

    public Iterator<Product> iterator(){
        return new IteratorProduct(products);
    }

    public static List<Product> buildShopWithProducts(){

        products = new ArrayList<>();
        PrType prType = new PrType("Snack");
        Product product1 = new Product("Snikers", 33.45, prType) ;
        Product product2 = new Product("Nuts", 10.15, prType) ;
        Product product3 = new Product("Lays", 99.99, prType) ;
        Bottle bottle = new Bottle("Aqua", 88.0, 0.5);
        HotDrink hotDrink = new HotDrink("Americano",110, 80);
        HotDrink hotDrink2 = new HotDrink("Italiano",110, 80);
//        System.out.println(product);


        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(bottle);
        products.add(hotDrink);
        products.add(hotDrink2);



        return  products;
    }

    public static List<Product> getProducts(){
        return products;
    }


    public static Order addOrder(String name){
        Shop.buildShopWithProducts();
        String nameOrder = name;
        for (Product product: products) {
            if(product.getName().equals(nameOrder)){
                Order order = new Order(List.of(product), product.getPrice(), false, false);

//                System.out.println(nameOrder);
                return order;
            }
        }
        return null;
    }
}

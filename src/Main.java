import VendingMachine.Actor.Order;
import VendingMachine.Actor.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Order order = person.makeOrder("Americano");
        System.out.println(order);
        person.payForOrder(order);
        System.out.println(order);
        person.takeOrder(order);
        System.out.println(order);




//        Holder holder = new Holder();
//        CoinDispancer coinDispancer = new CoinDispancer();
//        VendingMachine vendingMachine = new VendingMachine(holder, coinDispancer, products);
//        for (Product prod: vendingMachine.getProductList()) {
//            System.out.println(prod);
//        }
//        System.out.println();


    }

}
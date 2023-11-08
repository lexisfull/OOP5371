import VendingMachine.Service.VendingMachine;
import VendingMachine.StreamComparator.FabricProductList;
import VendingMachine.StreamComparator.Stream;
import VendingMachine.StreamComparator.StreamService;

public class Main {

    public static void main(String[] args) {

//        Shop.buildShopWithProducts();
//        Collections.sort(Shop.getProducts());
//        IteratorProduct iteratorProduct = new IteratorProduct(Shop.getProducts());
//        while (iteratorProduct.hasNext()){
//            System.out.println(iteratorProduct.next());
//        }
//        Shop.getProducts().sort(new ProductComparatorByName());
//        System.out.println(Shop.getProducts());
//
//        System.out.println();
//        System.out.println("******************");
//        System.out.println();
//
//        Person person = new Person();
//        Order order = person.makeOrder("Americano");
//        System.out.println(order);
//        person.payForOrder(order);
//        System.out.println(order);
//        person.takeOrder(order);
//        System.out.println(order);
//
//        System.out.println();
//        System.out.println("******************");
//        System.out.println();
//
//        Market market = new Market();
//        person.setName("Bobby");
//        market.acceptToMarket(person);
//        market.takeInQueue(person);
//        market.takeOrders();
//        market.giveOrders();
//        market.releaseFromQueue();
//        market.releaseFromMarket(person);
//
//        System.out.println();
//        System.out.println("******************");
//        System.out.println();
//
//        VendingMachine vendingMachine = new VendingMachine(Shop.buildShopWithProducts());
//        System.out.println(vendingMachine.getProductList());
//
//        System.out.println();
//        System.out.println("******************");
//        System.out.println();

        Stream stream = new Stream();
        VendingMachine vendingMachine1 = new VendingMachine(FabricProductList.generateProducList());
        VendingMachine vendingMachine2 = new VendingMachine(FabricProductList.generateProducList());
        VendingMachine vendingMachine3 = new VendingMachine(FabricProductList.generateProducList());
        VendingMachine vendingMachine4 = new VendingMachine(FabricProductList.generateProducList());
        VendingMachine vendingMachine5 = new VendingMachine(FabricProductList.generateProducList());
        VendingMachine vendingMachine6 = new VendingMachine(FabricProductList.generateProducList());
        stream.addVendingMachine(vendingMachine1);
        stream.addVendingMachine(vendingMachine2);
        stream.addVendingMachine(vendingMachine3);
        stream.addVendingMachine(vendingMachine4);
        stream.addVendingMachine(vendingMachine5);
        stream.addVendingMachine(vendingMachine6);
//        System.out.println(stream);

        System.out.println();
        System.out.println("******************");
        System.out.println();

        StreamService.sortVendingMachine(stream.setVendingMachines());


    }

}
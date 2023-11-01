package VendingMachine.Actor;

import VendingMachine.Domain.Product;

import java.util.Comparator;

public class ProductComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        return o1.getName().charAt(0) - o2.getName().charAt(0);
    }
}

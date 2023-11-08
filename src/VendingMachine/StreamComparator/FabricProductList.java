package VendingMachine.StreamComparator;

import VendingMachine.Domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricProductList {
    private static Random random = new Random();

    public static Product generateProduct(){
        String[] names = {"Чипсы", "Шоколад", "Вода", "Протеин", "Батончик", "Энергетик", "Жвачка", "Салфетки", "Кола", "Тапочки"};
        return new Product(names[random.nextInt(names.length)]);
    }

    public static List<Product> generateProducList(){
        int count = random.nextInt(1, 10);
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
                  products.add(i, generateProduct());
        }
        return products;
    }

}

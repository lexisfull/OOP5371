package VendingMachine.StreamComparator;
//— Создать класс ПотокСервис, добавив в него метод сортировки списка магазинов, используя созданный StreamComparator;

import VendingMachine.Service.VendingMachine;

import java.util.Collections;
import java.util.List;
/*
*  Метод сортирует аппараты по количеству товара, основываясь на размере длины листа.
 */
public class StreamService{
    public static void sortVendingMachine(List<VendingMachine> vendingMachines){
        Collections.sort(vendingMachines, new StreamComparator());
        for (VendingMachine vendingMachine: vendingMachines) {
            System.out.println(vendingMachine);
        }
    }
}

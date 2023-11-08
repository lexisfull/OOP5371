package VendingMachine.StreamComparator;

//— Создать класс StreamComparator, реализующий сравнение количества товаров в каждом из магазинов, входящих в Поток;

import VendingMachine.Service.VendingMachine;

import java.util.Comparator;

public class StreamComparator implements Comparator<VendingMachine> {


    @Override
    public int compare(VendingMachine o1, VendingMachine o2) {
        return Double.compare(o1.getProductList().size(), o2.getProductList().size());
    }
}

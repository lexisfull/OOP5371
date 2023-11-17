package VendingMachine.StreamComparator;


import VendingMachine.Service.VendingMachine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<VendingMachine>{
    private List<VendingMachine> vendingMachines;

    public Stream() {
        this.vendingMachines = new ArrayList<>();
    }

    /*
    * Метод добавляет в список аппаратов еще аппарат
     */
    public void addVendingMachine(VendingMachine vendingMachine){
        this.vendingMachines.add(vendingMachine);
    }


    public List<VendingMachine> setVendingMachines(){
        return vendingMachines;
    }

    @Override
    public Iterator<VendingMachine> iterator() {
        return vendingMachines.iterator();
    }

    @Override
    public String toString() {
        return
                "VendingMachines = " + vendingMachines + "\n";
    }
}

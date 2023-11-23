package FruitsBox.Model;

import FruitsBox.Fruit;

import java.util.ArrayList;
import java.util.Locale;

public class FruitBox<T extends Fruit> {
    private static int counter;
    private final int no;
    private Fruit fruit;

    public FruitBox(){
        no = ++counter;
    }

    private ArrayList<T> fruits = new ArrayList<>();

    public boolean addFruit(Fruit fruit){
        return fruits.add((T) fruit);
    }

    public float getWeight(){
        float res = 0;
        for (T fruit: fruits) {
            res += fruit.getWight();
        }
        return res;
    }

    public int getSize(){
        return fruits.size();
    }


    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Коробка %d", no);
    }

    public T getIndex() {
        return fruits.get(fruit.getIndex());
    }
}

package FruitsBox.Model;

import FruitsBox.Fruit;

public class Apple implements Fruit {
    private float weight;
    private int counter;
    private int no;

    public Apple(float weight) {
        this.weight = weight;
    }


    @Override
    public float getWight() {
        return weight;
    }

    @Override
    public int getIndex() {
        return no = ++counter;
    }
}

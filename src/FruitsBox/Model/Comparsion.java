package FruitsBox.Model;

import java.util.Comparator;

public class Comparsion implements Comparator<FruitBox> {

    @Override
    public int compare(FruitBox o1, FruitBox o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }

}

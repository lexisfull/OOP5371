package FruitsBox.Model;

import java.util.ArrayList;
import java.util.Collections;

public class CompareService {
    public static void sortFruitsBox(ArrayList<FruitBox> fruitBoxes){
        Collections.sort(fruitBoxes, new Comparsion());
        for (FruitBox fruitbox: fruitBoxes) {
            System.out.println(fruitbox + " - " + " весит " + fruitbox.getWeight());
        }
    }
}

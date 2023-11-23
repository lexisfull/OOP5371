package FruitsBox.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<FruitBox>{
    private ArrayList<FruitBox> boxArrayList;

    public ArrayList<FruitBox> setBoxArrayList() {
        return boxArrayList;
    }
    public Stream() {
        this.boxArrayList = new ArrayList<>();
    }
    public void addFruitBox(FruitBox fruitBox){
        this.boxArrayList.add(fruitBox);
    }
    @Override
    public Iterator<FruitBox> iterator() {
        return boxArrayList.iterator();
    }

}

package TaskGenerallizations1;
//Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов.
//Этот класс должен иметь два поля для хранения объектов и соответствующие геттеры и сеттеры.
//Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы
//в каждой паре. Например, если у вас есть пара (A, B),
//после вызова swapPairs она должна стать парой (B, A). Используйте обобщенные методы для реализации этой операции.

import java.util.ArrayList;

public class Pair<T> {

//    Creating class fields
    private T first;
    private T second;
//    Creating array
//    private ArrayList<Pair<?>> list;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
//    We pass through the entire array
    public void swapPair(ArrayList<Pair<?>> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).swap(list.get(i));
        }
        System.out.println(list);
    }
//  The method swaps values
    public void swap(Pair<?> pair){
        Object temp = first;
        first = second;
        second = (T) temp;
    }

    @Override
    public String toString() {
        return "{" +
                "first = " + first +
                ", second = " + second +
                "}";
    }
}

package TaskGenerallizations1;

import java.util.ArrayList;

//```Цель: Практика создания обобщенных классов и методов для обработки различных типов данных.
//Инструкции:
//Создайте обобщенный класс Box, который будет представлять собой коробку,
//способную хранить объекты разных типов. Класс Box должен иметь поле для хранения объекта
//и соответствующие геттеры и сеттеры.
//Создайте метод printBoxContents, который принимает объект класса Box и выводит на экран
//содержимое этой коробки. Обратите внимание, что этот метод должен работать с любым типом
//объекта, хранящегося в Box. Используйте обобщенные методы для достижения этой цели.
//Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов.
//Этот класс должен иметь два поля для хранения объектов и соответствующие геттеры и сеттеры.
//Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы
//в каждой паре. Например, если у вас есть пара (A, B),
//после вызова swapPairs она должна стать парой (B, A). Используйте обобщенные методы для реализации этой операции.
//Напишите программу, которая демонстрирует использование вашего
//обобщенного класса Box и методов printBoxContents и swapPairs для разных типов данных
//(например, целых чисел, строк, объектов пользовательских классов и т. д.).
//Выведите результаты выполнения программы на экран, чтобы показать, что методы работают с разными типами данных.
//Примечания:
//Обязательно добавьте комментарии к вашему коду, чтобы объяснить,
//какие части кода выполняют какие задачи и как обобщенные типы используются в вашей программе.
//При реализации метода swapPairs, учтите, что он должен работать с любыми типами объектов внутри пары.
//Экспериментируйте с разными типами данных, чтобы продемонстрировать универсальность вашего кода.
//
//Удачи в выполнении задания!
public class Programm {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.setObj(123124);
        box1.printBoxContents(box1);
        box2.setObj("Hello!");
        box2.printBoxContents(box2);
        System.out.println();
        System.out.println("____________");
        System.out.println();
        Pair<Number> pair1 = new Pair<>(1,2);
        Pair<String> pair2 = new Pair<>("Hello!", "Great!");
        Pair<Character> pair3 = new Pair<>('+', '?');
        ArrayList<Pair<?>> list = new ArrayList<>();
        list.add(pair1);
        list.add(pair2);
        list.add(pair3);
        System.out.println(list);
        System.out.println("\n -------------\n");
        pair3.swapPair(list);
    }
}

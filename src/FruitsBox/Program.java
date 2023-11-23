package FruitsBox;

import FruitsBox.Model.*;

/*Задание: Создание обобщенного класса и методов для работы с фруктами
 Создайте обобщенный класс FruitBox<T>, представляющий коробку с фруктами.
 Этот класс должен иметь следующие методы:
addFruit(fruit: T): метод для добавления фрукта в коробку.
getWeight(): double: метод для расчета веса коробки с фруктами.

Предположим, что каждый фрукт имеет свой вес, который можно получить с помощью метода getWeight().
Создайте несколько классов для разных типов фруктов,
например, Apple, Orange, Banana.

 Каждый из этих классов должен реализовать общий
интерфейс Fruit, который будет содержать метод getWeight(), возвращающий вес фрукта.
Создайте несколько объектов каждого типа фрукта и поместите их в соответствующие коробки с помощью метода addFruit().

Попробуйте выполнить следующие операции:
Рассчитать и вывести на экран вес каждой коробки с фруктами.
Сравнить вес двух коробок и вывести результат сравнения (равны или нет).
Пересыпать фрукты из одной коробки в другую так, чтобы тип фруктов в целевой коробке
соответствовал типу исходной коробки (например, из коробки с яблоками в коробку с яблоками).
Обратите внимание на то, что в данном задании обобщения позволяют создать
универсальный класс FruitBox, который может хранить фрукты разных типов,
сохраняя при этом типы данных для каждой коробки.

Убедитесь, что ваши решения компилируются и работают корректно.
*/
public class Program {
    public static void main(String[] args) {
        Stream stream = new Stream();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.addFruit(new Apple(1.0f));
        appleFruitBox.addFruit(new Apple(1.3f));
        appleFruitBox.addFruit(new Apple(1.2f));
        appleFruitBox.addFruit(new Apple(1.2f));
        appleFruitBox.addFruit(new Apple(1.2f));
        FruitBox<Apple> appleFruitBox2 = new FruitBox<>();
        appleFruitBox2.addFruit(new Apple(1));
        appleFruitBox2.addFruit(new Apple(1.1f));
        appleFruitBox2.addFruit(new Apple(1.5f));
        FruitBox<Banana> bananaFruitBox = new FruitBox<>();
        bananaFruitBox.addFruit(new Banana(2f));
        bananaFruitBox.addFruit(new Banana(1.7f));
        bananaFruitBox.addFruit(new Banana(1.5f));
        FruitBox<Orange> orangeFruitBox = new FruitBox<>();
        orangeFruitBox.addFruit(new Orange(2));
        orangeFruitBox.addFruit(new Orange(1.5f));
        orangeFruitBox.addFruit(new Orange(1.3f));
        orangeFruitBox.addFruit(new Orange(2));
        orangeFruitBox.addFruit(new Orange(1.5f));
        orangeFruitBox.addFruit(new Orange(2));
        System.out.println(appleFruitBox.getWeight());
        System.out.println(appleFruitBox2.getWeight());
        System.out.println(bananaFruitBox.getWeight());
        System.out.println(orangeFruitBox.getWeight());

        stream.addFruitBox(orangeFruitBox);
        stream.addFruitBox(appleFruitBox);
        stream.addFruitBox(appleFruitBox2);
        stream.addFruitBox(bananaFruitBox);
        CompareService.sortFruitsBox(stream.setBoxArrayList());

    }
}

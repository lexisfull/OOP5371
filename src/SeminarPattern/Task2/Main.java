package SeminarPattern.Task2;

public class Main {
    public static void main(String[] args) {
        // Создаем объект ConcreteCreatorA и используем его для создания продукта.
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.display(); // Выводит: "Это продукт A."

        // Создаем объект ConcreteCreatorB и используем его для создания другого продукта.
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.display(); // Выводит: "Это продукт B."
    }
}
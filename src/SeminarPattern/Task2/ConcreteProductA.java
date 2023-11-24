package SeminarPattern.Task2;



// Создаем две конкретные реализации продукта - ConcreteProductA и ConcreteProductB.
public class ConcreteProductA implements Product {
    @Override
    public void display() {
        System.out.println("Это продукт A.");
    }
}
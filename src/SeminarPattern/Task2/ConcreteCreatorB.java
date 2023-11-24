package SeminarPattern.Task2;

public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
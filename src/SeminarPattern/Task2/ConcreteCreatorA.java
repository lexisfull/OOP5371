package SeminarPattern.Task2;
// Фабричный метод
// Создаем два конкретных создателя - ConcreteCreatorA и ConcreteCreatorB,
// которые реализуют фабричный метод для создания конкретных продуктов.
public class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
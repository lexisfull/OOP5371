package SeminarPattern.Task1;
// Создаем класс Singleton с приватным статическим полем instance,
// которое будет хранить единственный экземпляр класса.
public class Singleton {
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне класса.
    private Singleton() {
    }

    // Метод getInstance() предоставляет глобальную точку доступа к единственному экземпляру.
    public static Singleton getInstance() {
        // Если экземпляр еще не создан, создаем его.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

package SeminarPattern.Task1;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton через метод getInstance().
        Singleton singleton1 = Singleton.getInstance();

        // Попробуем получить еще один экземпляр - он будет тем же самым объектом.
        Singleton singleton2 = Singleton.getInstance();

        // Проверим, что оба объекта на самом деле являются одним и тем же экземпляром.
        if (singleton1 == singleton2) {
            System.out.println("singleton1 и singleton2 - один и тот же объект.");
        } else {
            System.out.println("singleton1 и singleton2 - разные объекты.");
        }
    }
}

package SolidPrincipal.Solid4.TaskSolid4;
/*
Interface Segregation Principle (Принцип разделения интерфейса).
Создавайте узкоспециализированные интерфейсы, предназначенные для конкретного клиента.
Клиенты не должны зависеть от интерфейсов, которые они не используют.

Этот принцип направлен на устранение недостатков, связанных с реализацией больших интерфейсов.
 */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Engineer implements Workable, Sleepable {
    @Override
    public void work() {
        // Работа инженера
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

class Waiter implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Обслуживание клиентов
    }

    @Override
    public void eat() {
        // Перерыв на обед
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

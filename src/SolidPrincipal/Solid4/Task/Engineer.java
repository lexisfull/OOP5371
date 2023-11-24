package SolidPrincipal.Solid4.Task;

interface Worker {
    void work();
    void eat();
    void sleep();
}

class Engineer implements Worker {
    @Override
    public void work() {
        // Работа инженера
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

class Waiter implements Worker {
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

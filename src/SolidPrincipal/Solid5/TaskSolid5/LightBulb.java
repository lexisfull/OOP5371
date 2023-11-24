package SolidPrincipal.Solid5.TaskSolid5;
/*
Dependency Inversion Principle (Принцип инверсии зависимостей).

Объектом зависимости должна быть абстракция, а не что-то конкретное.

Модули верхних уровней не должны зависеть от модулей нижних уровней.
Оба типа модулей должны зависеть от абстракций.
Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
 */
interface Switchable {
    void turnOn();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Включить лампочку
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        // Включить вентилятор
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

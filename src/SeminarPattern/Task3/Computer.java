package SeminarPattern.Task3;

// Создаем класс Компьютер, который будет конфигурироваться с помощью Строителя.
class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void display() {
        System.out.println("Компьютер с процессором " + processor + ", " + ram + " ГБ RAM и " + storage + " ГБ хранилища.");
    }
}
package SeminarPattern.Task3;

public class Main {
    public static void main(String[] args) {
        // Используем Строителя для создания компьютера с определенными параметрами.
        ComputerBuilder builder = new ConcreteComputerBuilder();
        Computer computer = builder
//                .setProcessor("Intel Core i7")
//                .setRam(16)
                .setStorage(512)
                .build();

        // Отображаем созданный компьютер.
        computer.display(); // Выводит: "Компьютер с процессором Intel Core i7, 16 ГБ RAM и 512 ГБ хранилища."
    }
}

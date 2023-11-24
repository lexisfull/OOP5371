package SeminarPattern.Task3;

// Создаем интерфейс Строителя, который определяет методы для конфигурации компьютера.
interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(int storage);
    Computer build();
}

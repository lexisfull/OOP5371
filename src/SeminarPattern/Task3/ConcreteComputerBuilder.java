package SeminarPattern.Task3;

// Создаем конкретного Строителя, который реализует интерфейс ComputerBuilder.
class ConcreteComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private int storage;

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, ram, storage);
    }
}
package Solid5.TaskSolid5;

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

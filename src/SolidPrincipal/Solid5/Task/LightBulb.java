package SolidPrincipal.Solid5.Task;

class LightBulb {
    public void turnOn() {
        // Включить лампочку
    }
}

class Switch {
    private LightBulb bulb;

    public Switch() {
        bulb = new LightBulb();
    }

    public void operate() {
        bulb.turnOn();
    }
}

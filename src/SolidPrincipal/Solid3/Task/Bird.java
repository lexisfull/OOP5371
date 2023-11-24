package SolidPrincipal.Solid3.Task;

public class Bird {
    public void fly() {
        // Полет птицы
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Острич не может летать, поэтому этот метод переопределен, но ничего не делает
    }
}

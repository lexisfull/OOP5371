package SolidPrincipal.Solid3.TaskSolid3;
/*
Liskov Substitution Principle (Принцип подстановки Барбары Лисков).
Цель этого принципа заключаются в том,
чтобы классы-наследники могли бы использоваться вместо родительских классов,
от которых они образованы, не нарушая работу программы.
 */
interface Bird {
    void move();
}

class Sparrow implements Bird {
    @Override
    public void move() {
        // Полет воробья
    }
}

class Ostrich implements Bird {
    @Override
    public void move() {
        // Движение страуса, не включает полет
    }
}

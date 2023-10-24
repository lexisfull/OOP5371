package VendingMachine.Actor;

public abstract class Actor implements ActorBehavior{

    boolean isTakeOrder;
    boolean isSetOrder;

    String name;
    int age;

    int money;

    public Actor(boolean isTakeOrder, boolean isSetOrder, String name, int age, int money) {
        this.isTakeOrder = isTakeOrder;
        this.isSetOrder = isSetOrder;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Actor() {
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public boolean isSetOrder() {
        return isSetOrder;
    }

    public void setSetOrder(boolean setOrder) {
        isSetOrder = setOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public abstract void payForOrder(Order order);
}

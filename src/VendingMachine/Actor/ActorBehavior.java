package VendingMachine.Actor;

public interface ActorBehavior {
    public void generateNumber();
    public  Order makeOrder(String string);
    public void takeOrder(Order order);
    public void payForOrder(Order order);


}

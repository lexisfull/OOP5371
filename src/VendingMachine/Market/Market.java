package VendingMachine.Market;

/*реализовывает два
вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах*/

import VendingMachine.Actor.Actor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{

    List<Actor> actors = new ArrayList<>();
    Queue<Actor> actorQueue = new ArrayDeque<>();


// Вход в магазин
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " Покинул магазин");
    }

    @Override
    public void update() {

    }
//Встать в очередь
    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);
        System.out.println("Встал в очередь: " + actor.getName());
    }
// Создать заказ
    @Override
    public void takeOrders() {
        actorQueue.peek().isTakeOrder();
        System.out.println(actorQueue.peek().getName() + " - сделал заказ");
    }
// Выдать заказ
    @Override
    public void giveOrders() {
        actorQueue.peek().isSetOrder();
        System.out.println(actorQueue.peek().getName() + " забрал заказ");
    }

//Выход из очереди
    @Override
    public void releaseFromQueue() {
        System.out.println("Покинул очередь " + actorQueue.peek().getName());
        actorQueue.poll();
    }

}

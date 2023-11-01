package VendingMachine.Market;

/*описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа*/

import VendingMachine.Actor.Actor;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}

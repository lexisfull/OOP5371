package VendingMachine.Market;

/*описывает
логику магазина – приход/уход покупателей,
обновление состояния магазина*/

import VendingMachine.Actor.Actor;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actors);
    void update();
}

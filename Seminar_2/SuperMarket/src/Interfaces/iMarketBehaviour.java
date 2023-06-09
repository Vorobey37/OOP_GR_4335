package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Чертеж методов для использования, касающиеся магазина.
 */
public interface iMarketBehaviour {

    /**
     * Данный метод представляет из себя чертеж, который нужно будет
     * переопределить (написать логику) в классе, его имплементирующем.
     * Подробности описаны в переопределении.
     * @param actor (объект - клиент)
     */
    void acceptToMarket(Actor actor);

    /**
     * Данный метод представляет из себя чертеж, который нужно будет
     * переопределить (написать логику) в классе, его имплементирующем.
     * Подробности описаны в переопределении.
     * @param actorы (список объектов - клиентов)
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Данный метод представляет из себя чертеж, который нужно будет
     * переопределить (написать логику) в классе, его имплементирующем.
     * Подробности описаны в переопределении.
     */
    void update();

    
}

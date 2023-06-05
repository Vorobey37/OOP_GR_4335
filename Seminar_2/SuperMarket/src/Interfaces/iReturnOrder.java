package Interfaces;

import Classes.Actor;

/**
 * Чертежи методов, которые нужно имплементировать к классу Market.
 */
public interface iReturnOrder {

    /**
     * Чертеж для метода по определению, можно ли делать возврат клиенту
     * @param actor - клиент
     * @return true или false
     */
    boolean isAllowToReturnOrder(Actor actor);

    /**
     * Чертеж для метода по возврату 
     */
    void makeReturnOrder();

    /**
     * Чертеж для метода по постановки в очередь на возврат
     */
    void queueToReturn();
    
    
}

package Classes;


import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<Actor> queue;
    private List<Actor> queueToReturnActors;
    
    public Market() {
        this.queue = new ArrayList <Actor>();
        this.queueToReturnActors = new ArrayList<Actor>();
    }

    @Override
    /*
     * Принимает объект в качестве аргумента и добавляет его 
     * в список очереди queue.
     */
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }

    @Override
    /*
     * Создает список объектов (клиентов) и помещает туда те (из списка queue), которые получили 
     * заказ (проверяет объекты в списке queue методом isTakeOrder()). Далее использует данный список
     * в качестве аргумента и удаляет(объекты в данном списке) из очереди(методом releaseFromMarket())
     */
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    /**
     * Устанавливает значение true у параметра pikUpOrder, который 
     * принимает метод setMakeOrder(), а также выводит запись на консоль.
     */
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
            }
            System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            
        }
        
    }

    @Override
    /**
     * Устанавливает значение true у параметра makeOrder, который 
     * принимает метод setTakeOrder()(для конкретного объекта в очереди(в списке queue)), 
     * а также выводит запись на консоль.
     */
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
            
        }
    }

    @Override
    /*
     * Выводит на консоль запись и ставит объект в очередь.
     */
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    /*
     * Принимает список объектов (клиентов в магазине) в качестве аргумента, выбирает конкретный 
     * объект(к которому применяется данный метод), делает соответсвующую запись на консоль и 
     * удаляет объект из очереди.
     */
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    /*
     * Метод, который последовательно выполняет следующие методы для
     * комбинации (упрощения вывода нескольких методов одним).
     */
    public void update() {
       takeOrder();
       giveOrder();
       queueToReturn();
       makeReturnOrder();
       releaseFromQueue();
    }

    @Override
    /**
     * Принимает в качестве аргумента объект(клиента),
     * возвращает значение true или false в зависимости от того, бракованный ли товар
     * @param actor - клиент
     * @return значение true или false
     */
    public boolean isAllowToReturnOrder(Actor actor) {
        return actor.getIsDefectProduct();
    }

    @Override
    /**
     * Перебирает всех клиентов из очереди с дефектными товарами.
     * Делает соответствующую запись.
     */
    public void makeReturnOrder() {
        for (Actor actor : queueToReturnActors) {
            System.out.println(actor.getName() + " клиент сделал возврат ");
        }
    }

    @Override
    /**
     * Перебирает всех клиентов из очереди, определяет можно ли делать возврат.
     * Помещает в очередь на возврат.
     */
    public void queueToReturn() {    
        for (Actor actor : queue) {
            if (isAllowToReturnOrder(actor)) {
                this.queueToReturnActors.add(actor);
                System.out.println(actor.getName() + " клиент встал в очередь на возврат ");
            }
    }

    }
    
}


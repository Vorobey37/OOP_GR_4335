package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isDefectProduct;

    public Actor(String name, boolean isDefectProduct) {
        this.name = name;
        this.isDefectProduct = isDefectProduct;
    }
    /**
     * Данный метод представляет из себя чертеж, 
     * согласно которому нужно будет переопределить метод в классе-потомке, 
     * в котором, в свою очередь подразумевается, что будет написана логика по  
     * возвращению имени объекта типа String.
     * @return значение типа String
     */
    abstract public String getName();

    
}

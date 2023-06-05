package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name, boolean isDefectProduct) {
        super(name, isDefectProduct);
    }

    
     @Override
     /*
     * Возвращает значение(имя клиента) типа String
     */
       public String getName() {
        return super.name;
        
    }
    /**
     * Метод, который возвращает true или false, в зависимости от
     * того, взял ли клиент заказ (какое значение у параметра isTakeOrder).
     * @return true или false
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод, который возвращает true или false, в зависимости от
     * того, сделал ли клиент заказ (какое значение у параметра isMakeOrder).
     * @return true или false
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод, который принимает значение true или false для того, чтобы 
     * установить его в параметр isMakeOrder
     * 
     * @param makeOrder в значении true или false
     */
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Метод, который принимает значение true или false для того, чтобы
     * установить его в параметр isTakeOrder
     * @param pikUpOrder в значении true или false
     */
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }
    
    /**
     * Метод возвращает объект, к которому применен данный метод.
     * Для чего используется - непонятно.
     * @return объект
     */
    public Actor getActor() {
        return this;
    }


    @Override
    /**
     * Возвращает значение бракованный ли продукт у клиента?
     * @return true или false
     */
    public boolean getIsDefectProduct() {
        return super.isDefectProduct;
    }
}


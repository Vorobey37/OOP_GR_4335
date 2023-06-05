package Classes;

public class SpecialClient extends Actor {

    private int idVIP;
    /**
     * 
     * @param name
     * @param idVIP
     */

    public SpecialClient(String name, boolean isDefectProduct, int idVIP) {
        super(name, isDefectProduct);
        this.idVIP = idVIP;
        
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
     * Возвращает значение параметра idVIP(применяемого объекта)
     * @return значение типа int
     */
    public int getIdVIP() {
        return idVIP;
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

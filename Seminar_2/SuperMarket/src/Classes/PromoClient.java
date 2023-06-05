package Classes;

public class PromoClient extends Actor {

    private String promoName;
    private int idPromoClient;
    static int promoQuantity = 10;


    public PromoClient(String name, boolean isDefectProduct, int idPromoClient, String promoName) {
        super(name, isDefectProduct);
        this.idPromoClient = idPromoClient;
        this.promoName = promoName;
    }

    /**
     * Возвращает название акции типом String
     * @return promoName типа String
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Возвращает значение idPromoClient.
     * @return значение типа int
     */
    public int getIdPromoClient() {
        return idPromoClient;
    }

    @Override
    /**
     * Метод, который принимает значение true или false для того, чтобы 
     * установить его в параметр isMakeOrder
     */
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    /**
     * Метод, который принимает значение true или false для того, чтобы
     * установить его в параметр isTakeOrder
     */
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    @Override
    /**
     * Метод, который возвращает true или false, в зависимости от
     * того, взял ли клиент заказ (какое значение у параметра isTakeOrder).
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    /**
     * Метод, который возвращает true или false, в зависимости от
     * того, сделал ли клиент заказ (какое значение у параметра isMakeOrder).
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    /**
     * Метод возвращает объект, к которому применен данный метод.
     * Для чего используется - непонятно.
     */
    public Actor getActor() {
        return this;
    }

    @Override
    /*
     * Возвращает значение(имя клиента) типа String
     */
    public String getName() {
        return super.name;
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

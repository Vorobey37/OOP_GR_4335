package Domen;

public class Bottle extends Product{
    private int volume;

    /**
     * 
     * @param productID
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     */


     public Bottle(int productID, String productName, String productCategory, double price, int volume) {
        super(productID, productName, productCategory, price);
        this.volume = volume;
     }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if (volume<=0) {
            throw new RuntimeException("Такого объема быть не может!");
        }
        this.volume = volume;
    }
     
    @Override
    public String toString () {
        return "Product{name = " + super.getProductName() + 
        ", category = " + super.getProductCategory() + 
        ", cost = " + super.getPrice() + 
        ", volume = " + volume + "}";
    }
    
}

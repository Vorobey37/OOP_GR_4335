package Domen;

public class HotDrinks extends Product {
    private int temperature;
    private int volume;


    /**
     * 
     * @param productID
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @param temperature для горячих напитков диапазон [50 - 99]
     */
    
    public HotDrinks(int productID, String productName, String productCategory, double price, int volume, int temperature) {
       super(productID, productName, productCategory, price);
       this.temperature = temperature;
       this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if(temperature<50 || temperature>99) {
            throw new RuntimeException("Неправильный диапазон температуры для горячих напитков");
        }
        this.temperature = temperature;
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
        ", volume = " + volume +
        ", temperature = " + temperature + "}";
    }
    
}

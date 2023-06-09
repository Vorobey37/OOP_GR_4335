package VendingMachines;

import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volume;
    private List<Product> products;

    /**
     * 
     * @param volume
     */

    
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume<=0) {
            throw new RuntimeException("Значение отрицательное! Так нельзя!");
        }
        this.volume = volume;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct (Product prod) {
        products.add(prod);
    }

    public void printProducts() {
        for(Product prod: products){
            System.out.println(prod.toString());
        }
    }
}

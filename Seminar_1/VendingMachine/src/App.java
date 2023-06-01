import Domen.Bottle;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Water", 30, 500);
        item2.setPrice(70);
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Вологжанка", "Масло", 125));
        iMachine.addProduct(new Bottle(4, "Архыз", "Water", 45, 1000));

        for(Product prod: iMachine.getProducts()){
            System.out.println(prod.toString());
        }
        // System.out.println(item1.toString());
        // System.out.println(item2.toString());


        //System.out.println("Hello, World!");
    }
}


import Domen.Bottle;
import Domen.HotDrinks;
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
        Product item5 = new HotDrinks(5, "Капучино", "Coffee", 90, 200, 85);
        iMachine.addProduct(item5);
        iMachine.addProduct(new HotDrinks(6, "Tess", "Tea", 30, 200, 95));
        iMachine.addProduct(new HotDrinks(7, "Американо", "Coffee", 80, 100, 85));

        iMachine.printProducts();
        
        
    }
}

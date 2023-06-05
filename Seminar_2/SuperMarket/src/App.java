import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Борис", false);
        OrdinaryClient client2 = new OrdinaryClient("Даша", true);
        SpecialClient client3 = new SpecialClient("President", false, 1);
        PromoClient client4 = new PromoClient("Алексей", true, 0, "Скидка 20%");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);

        market.update();

        
    }

}

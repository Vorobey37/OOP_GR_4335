package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Random rand = ThreadLocalRandom.current();

        List<iItemGenerator> genList = new ArrayList<iItemGenerator>();
        genList.add(new GoldGenerator());
        genList.add(new GemGenerator());

        for (int index = 0; index < 10; index++) {

            int indexFabric = Math.abs(rand.nextInt()%2 == 0? 0:1);
            iItemGenerator item = genList.get(indexFabric);
            item.openRerward();
            
        }
    }
}

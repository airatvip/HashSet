import java.util.ArrayList;
import java.util.List;

public class Random {

    public static void addRandom() {
        List<Integer> random = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            random.add((int) (Math.random() * 1000 + 1));
        }
        System.out.println(random);
        for (int i = random.size()-1; i >= 0; i--) {
            if (random.get(i) % 2 == 0)
                random.remove(i);


        }
        System.out.println(random);

    }
}







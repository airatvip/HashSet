import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Random {

    public static void addRandom() {
        Set<Integer> random2 = new HashSet<>();
        {
            Set<Integer> random = new HashSet<>();
            for (int i = 0; i < 20; i++) {
                random.add((int) (Math.random() * 1000 + 1));
            }
            System.out.println(random);

            for (Integer integer : random) {
                if (integer % 2 == 0) {
                    random2.add(integer);
                }
            }random.removeAll(random2);
        System.out.println(random);

        }
    }
}







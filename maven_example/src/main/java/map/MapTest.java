package map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < 1000; i++) {
            int num = rnd.nextInt(4);
            Integer count = countMap.get(num);

            if (count == null) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, count + 1);
            }
        }

        for (Map.Entry<Integer, Integer> kv : countMap.entrySet()) {
            System.out.println(kv.getKey() + ", " + kv.getValue());
        }
    }
}

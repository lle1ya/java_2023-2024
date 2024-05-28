package lab9;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, "Line " + i);
        }

        System.out.println("Lines > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.println("Lines = 0: " + map.get(0));
        }

        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }

        System.out.println("sum, when > 5: " + product);
    }
}

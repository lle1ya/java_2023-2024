package lr9.task4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(5000);
        for (int i = 1; i <= 3000; i++) {
            numbers.add(i);
        }

        int index = 0;
        while (numbers.size() > 1) {
            index = (index + 1) % numbers.size();
            numbers.remove(index);
        }

        System.out.println(numbers);
    }
}

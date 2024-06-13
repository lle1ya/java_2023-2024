package lr9.task4;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

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


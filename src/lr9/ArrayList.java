package lab9;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        int n = 10;
        List<Integer> people = new java.util.ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int count = 0;
        while (people.size() > 1) {
            count++;
            int index = (count - 1) % people.size();
            people.remove(index);
        }

        System.out.println("Winner: " + people.get(0));
    }
}
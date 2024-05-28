package lab9;

public class Example8 {
    public static void main(String[] args) {
        int n = 10;
        java.util.LinkedList<Integer> people = new java.util.LinkedList<>();

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

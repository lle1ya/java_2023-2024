package lr6;

public class Example3 {
    public static void main(String[] args) {
        int[] numbers = {15, 6, 44, 42, 69};

        System.out.println("Наибольшее: " + E3.max(numbers));
        System.out.println("Наименьшее: " + E3.min(numbers));
        System.out.println("Среднее: " + E3.avg(numbers));
    }
}

package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        System.out.println("������ arr: " + Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("������ arrResult: " + Arrays.toString(arrResult));
    }
    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}

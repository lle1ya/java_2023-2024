package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ��������: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }

        System.out.println("������ arr1: " + Arrays.toString(arr1));
        System.out.println("������ arr2: " + Arrays.toString(arr2));

        int[] resultArr = findCommonElements(arr1,arr2);
        System.out.println("������ resultArr: " + Arrays.toString(resultArr));
    }
    public static int[] findCommonElements(int[] arr1, int[] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
    }
}

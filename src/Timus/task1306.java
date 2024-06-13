package Timus;

import java.util.Arrays;
import java.util.Scanner;

public class task1306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        Arrays.sort(sequence);

        double median;
        if (N % 2 == 0) {
            median = (sequence[N/2 - 1] + sequence[N/2]) / 2.0;
        } else {
            median = sequence[N/2];
        }

        System.out.printf("%.1f", median);
    }
}

package Timus;

import java.util.Scanner;

public class task1494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] balls = new int[N];

        for (int i = 0; i < N; i++) {
            balls[i] = scanner.nextInt();
        }

        boolean isCheater = false;
        for (int i = 0; i < N; i++) {
            if (balls[i] != N - i) {
                isCheater = true;
                break;
            }
        }

        if (isCheater) {
            System.out.println("Cheater");
        } else {
            System.out.println("Not a proof");
        }
    }
}

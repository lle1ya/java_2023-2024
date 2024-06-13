package Timus;

import java.util.Scanner;

public class task1104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int minBase = getMinBase(input);

        for (int k = minBase; k <= 36; k++) {
            if (isDivisibleByKMinusOne(input, k)) {
                System.out.println(k);
                return;
            }
        }
        System.out.println("No solution.");
    }

    private static int getMinBase(String input) {
        int minBase = 2;
        for (char c : input.toCharArray()) {
            int value = charToValue(c);
            if (value >= minBase) {
                minBase = value + 1;
            }
        }
        return minBase;
    }

    private static int charToValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'Z') {
            return 10 + (c - 'A');
        }
        throw new IllegalArgumentException("Invalid character in input: " + c);
    }

    private static boolean isDivisibleByKMinusOne(String input, int base) {
        long number = 0;
        for (char c : input.toCharArray()) {
            number = number * base + charToValue(c);
            number %= (base - 1);
        }
        return number == 0;
    }
}

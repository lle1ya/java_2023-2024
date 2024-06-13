package Timus;

import java.util.Scanner;

public class task2070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();
        scanner.close();

        int count = 0;
        for (long i = L; i <= R; i++) {
            boolean isPrime = isPrime(i);
            int divisorCount = countDivisors(i);
            boolean isDivisorCountPrime = isPrime(divisorCount);

            if ((isPrime && isDivisorCountPrime) || (!isPrime && !isDivisorCountPrime)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int countDivisors(long n) {
        int count = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}

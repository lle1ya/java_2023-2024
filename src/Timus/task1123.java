package Timus;

import java.util.Scanner;

public class task1123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String salary = scanner.nextLine();
        scanner.close();

        System.out.println(findNextPalindromicSalary(salary));
    }

    private static String findNextPalindromicSalary(String salary) {
        int length = salary.length();
        char[] palindromicSalary = salary.toCharArray();

        int mid = length / 2;
        boolean leftSmaller = false;
        int i = mid - 1;
        int j = (length % 2 == 0) ? mid : mid + 1;

        while (i >= 0 && palindromicSalary[i] == palindromicSalary[j]) {
            i--;
            j++;
        }

        if (i < 0 || palindromicSalary[i] < palindromicSalary[j]) {
            leftSmaller = true;
        }

        while (i >= 0) {
            palindromicSalary[j] = palindromicSalary[i];
            i--;
            j++;
        }

        if (leftSmaller) {
            int carry = 1;
            i = mid - 1;

            if (length % 2 == 1) {
                palindromicSalary[mid] += carry;
                carry = (palindromicSalary[mid] - '0') / 10;
                palindromicSalary[mid] = (char) ((palindromicSalary[mid] - '0') % 10 + '0');
                j = mid + 1;
            } else {
                j = mid;
            }

            while (i >= 0) {
                palindromicSalary[i] += carry;
                carry = (palindromicSalary[i] - '0') / 10;
                palindromicSalary[i] = (char) ((palindromicSalary[i] - '0') % 10 + '0');
                palindromicSalary[j++] = palindromicSalary[i--];
            }
        }

        return new String(palindromicSalary);
    }
}

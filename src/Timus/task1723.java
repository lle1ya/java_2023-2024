package Timus;

import java.util.Scanner;

public class task1723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        String result = findSubstring(inputStr);

        System.out.println(result);
    }

    public static String findSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String substring = s.substring(i, j+1);
                if (countOccurrences(s, substring) == 2 && substring.length() > maxLength) {
                    maxLength = substring.length();
                    result = substring;
                }
            }
        }

        return result;
    }

    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(subStr, idx)) != -1) {
            count++;
            idx += subStr.length();
        }
        return count;
    }
}

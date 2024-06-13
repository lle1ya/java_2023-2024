package Timus;

import java.util.Scanner;

public class task1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedText = scanner.nextLine();

        encryptedText = encryptedText.replaceAll("[^a-zA-Z]", "");

        StringBuilder decryptedText = new StringBuilder();
        decryptedText.append(encryptedText.charAt(0));
        for (int i = 1; i < encryptedText.length(); i++) {
            if (encryptedText.charAt(i) != encryptedText.charAt(i - 1)) {
                decryptedText.append(encryptedText.charAt(i));
            }
        }

        System.out.println(decryptedText.toString());
    }
}

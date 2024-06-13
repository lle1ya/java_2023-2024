package lr9.task1;

import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(convertToBinary(scanner.nextInt()));
    }
    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber==0) {
            return "0";
        }
        else {
            int remainder = decimalNumber % 2;
            return convertToBinary(decimalNumber / 2, "") + remainder;
        }
    }
    private static String convertToBinary(int decimalNumber, String binary){
        if(decimalNumber == 0) {
            return binary;
        }
        else {
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            return convertToBinary(decimalNumber / 2, binary);
        }
    }
}

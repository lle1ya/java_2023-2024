package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = in.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = in.nextInt();

        int output = firstNum + secondNum;

        System.out.println(output);
        in.close();
    }
}

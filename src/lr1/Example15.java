package lr1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.println("Enter the second number: ");
        int secodNum = in.nextInt();

        int sumOfNums = firstNum + secodNum;
        int diffOfNum = firstNum - secodNum;

        System.out.println("Output: " + sumOfNums + ", " + diffOfNum);
        in.close();
    }
}

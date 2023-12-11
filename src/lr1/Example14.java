package lr1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = in.nextInt();

        int incrementNum = num + 1;
        int decrementNum = num - 1;
        int squareNum = num * num;

        System.out.println("Output: " + num + ", " + incrementNum + ", " + decrementNum + ", " + squareNum);
        in.close();
    }
}
